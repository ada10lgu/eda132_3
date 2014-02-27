package wumpus;

import java.util.ArrayList;
import java.util.Random;

public class Wumpus {
	public static void main(String[] args) {

		/*
		 * TODO ADD args definition of vars
		 */

		ArrayList<Stuff> stuff = new ArrayList<Stuff>();
		ArrayList<Gold> gold = new ArrayList<Gold>();
		Random r = new Random();

		int width = 3;
		int height = 3;
		int nGold = 12;

		Square[][] world = new Square[width][height];
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Square s = new Square(x, y, world);
				stuff.add(s);
				world[x][y] = s;
			}
		}
		Hero hero = new Hero("1", world[0][0]);
		stuff.add(hero);

		for (int i = 0; i < nGold; i++) {

			int x = r.nextInt(width);
			int y = r.nextInt(height);

			Gold g = new Gold(i, world[x][y]);
			stuff.add(g);
			gold.add(g);

		}

		System.out.println("(define (problem WUMPUS-BY-GENERATOR)");

		System.out.println("(:domain wumpus)");
		System.out.println("(:objects " + printObjects(stuff) + ")");

		System.out.println("(:init");

		for (Stuff s : stuff)
			System.out.println(s.getDefinition());

		for (Stuff s : stuff)
			System.out.print(s.getRules());

		System.out.println(")");

		System.out.println("(:goal");

		System.out.println(getGoal(hero, gold));

		System.out.println(")");

		System.out.println(")");

	}

	private static String getGoal(Hero h, ArrayList<Gold> gold) {
		StringBuilder sb = new StringBuilder();

		sb.append("(and ");
		
		for (Gold g : gold ) {
			sb.append("(hold ").append(h.getName()).append(" ").append(g.getName()).append(") ");
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
