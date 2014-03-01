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
	private String name;
	
	
	public Problem(int width, int height, int nGold) {
		name = "WUMPUS-BY-GENERATOR-w" + width + "-h" + height;
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

	@Override
	public String toString() {
		
		DataCollection define = new DataCollection("define");
		define.addData(new DataValue("problem","WUPUS-BY-GENERATOR"));
		define.addData(new DataValue(":doman","wumpus"));
		
		DataValue objects = new DataValue(":objects");
		for (Stuff s: stuff)
			objects.addValue(s.getName());
		define.addData(objects);
		
		DataCollection init = new DataCollection(":init");
		for (Stuff s: stuff)
			init.addData(s.getDefinition());
		for (Stuff s: stuff) {
			init.addData(s.getRules());
		}
		define.addData(init);
		DataCollection goal = new DataCollection(":goal");
		
		
		define.addData(goal);
		
		
		return define.treeToString();
//		StringBuilder sb = new StringBuilder();
//
//		String nl = System.getProperty("line.separator");
//
//		sb.append("(define (problem ").append(name).append(")").append(nl);
//
//		sb.append("\t(:domain wumpus)").append(nl);
//		sb.append("\t(:objects " + printObjects(stuff) + ")").append(nl);
// 
//		sb.append("\t(:init").append(nl);
//
//		for (Stuff s : stuff)
//			sb.append("\t\t").append(s.getDefinition()).append(nl);
//
//		for (Stuff s : stuff)
//			sb.append("\t\t").append(s.getRules()).append(nl);
//
//		sb.append(")").append(nl);
//
//		sb.append("(:goal").append(nl);
//
//		sb.append(getGoal(hero, gold)).append(nl);
//
//		sb.append(")").append(nl);
//
//		sb.append(")").append(nl);
//		return sb.toString();
	}

	private static String getGoal(Hero h, ArrayList<Gold> gold) {
		StringBuilder sb = new StringBuilder();

		sb.append("(and ");

		for (Gold g : gold) {
			sb.append("(hold ").append(h.getName()).append(" ")
					.append(g.getName()).append(") ");
		}

		sb.append(")");
		return sb.toString();
	}

	private static String printObjects(ArrayList<Stuff> stuff) {
		StringBuilder sb = new StringBuilder();

		for (Stuff s : stuff) {
			sb.append(s.getName()).append(" ");
		}

		return sb.toString();
	}
}
