package wumpus;

import java.util.ArrayList;

import wumpus.data.DataCollection;
import wumpus.data.DataValue;
import wumpus.stuff.Gold;
import wumpus.stuff.Hero;
import wumpus.stuff.Stuff;

public class Problem {

	private ArrayList<Stuff> stuff = new ArrayList<Stuff>();
	private ArrayList<Gold> gold = new ArrayList<Gold>();
	private Hero hero;
	private DataCollection define;

	public Problem(int width, int height, int nGold) {
		String name = "WUMPUS-BY-GENERATOR-w" + width + "-h" + height;

		init(width, height, nGold);
		createTree(name);

	}

	private void init(int width, int height, int nGold) {
		World world = new World(width, height);

		hero = new Hero("1", world.getStart());
		stuff.add(hero);

		world.addAll(stuff);

		for (int i = 0; i < nGold; i++) {
			Gold g = new Gold(i, world.getRandomSquare());
			gold.add(g);
			stuff.add(g);
		}
	}

	private void createTree(String name) {
		define = new DataCollection("define");
		define.addData(new DataValue("problem", name));
		define.addData(new DataValue(":doman", "wumpus"));

		DataValue objects = new DataValue(":objects");
		for (Stuff s : stuff)
			objects.addValue(s.getName());
		define.addData(objects);

		DataCollection init = new DataCollection(":init");
		for (Stuff s : stuff)
			init.addData(s.getDefinition());
		for (Stuff s : stuff) {
			init.addData(s.getRules());
		}
		define.addData(init);
		DataCollection goal = new DataCollection(":goal");

		DataCollection andGoal = new DataCollection("and");
		for (Gold g : gold)
			andGoal.addData(new DataValue("hold", hero.getName(), g.getName()));
		goal.addData(andGoal);
		define.addData(goal);
	}

	@Override
	public String toString() {
		return define.toString();
	}

}
