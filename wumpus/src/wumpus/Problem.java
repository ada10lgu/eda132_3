package wumpus;

import java.util.ArrayList;

import wumpus.data.DataCollection;
import wumpus.data.DataValue;
import wumpus.stuff.Arrow;
import wumpus.stuff.Gold;
import wumpus.stuff.Hero;
import wumpus.stuff.Stuff;

public class Problem {

	private ArrayList<Stuff> stuff = new ArrayList<Stuff>();
	private ArrayList<Gold> gold = new ArrayList<Gold>();
	private Hero hero;
	private DataCollection define;

	public Problem(int width, int height, int nGold, int pits, int wumpus) {
		String name = "WUMPUS-BY-GENERATOR-w" + width + "-h" + height;

		init(width, height, nGold, pits, wumpus);
		createTree(name);

	}

	private void init(int width, int height, int nGold, int pits, int wumpus) {
		World world = new World(width, height);

		Arrow a = new Arrow(0);
		hero = new Hero("1", world.getStart(), a);
		world.getStart().markSafe();
		stuff.add(hero);
		stuff.add(a);
		world.addAll(stuff);

		for (int i = 0; i < nGold; i++) {
			Gold g = new Gold(i, world.getRandomSquare());
			gold.add(g);
			stuff.add(g);
		}

		for (int i = 0; i < pits; i++) {
			world.getRandomSquare().isPit();
		}
		for (int i = 0; i < wumpus; i++) {
			world.getRandomSquare().isWumpus();
		}
	}

	private void createTree(String name) {
		define = new DataCollection("define");
		define.addData(new DataValue("problem", name));
		define.addData(new DataValue(":domain", "wumpus"));

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
		andGoal.addData(new DataValue("at", hero.getName(), hero.from.getName()));
		goal.addData(andGoal);
		define.addData(goal);
	}

	@Override
	public String toString() {
		return define.toString();
	}

}
