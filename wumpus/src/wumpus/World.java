package wumpus;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import wumpus.stuff.Square;
import wumpus.stuff.Stuff;

public class World {

	Square start;
	private Square[][] world;
	private ArrayList<Point> freeSlots;
	
	
	public World(int width, int height) {
		world = new Square[width][height];
		freeSlots = new ArrayList<Point>();
		
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Square s = new Square(x, y);
				world[x][y] = s;
				freeSlots.add(new Point(x,y));
			}
		}
		freeSlots.remove(new Point(0,0));
		start = world[0][0];
		for (int x = 0; x < width; x++)
			for (int y = 0; y < height; y++)
				addNeighbours(world[x][y], x, y);
	}

	private void addNeighbours(Square square, int x, int y) {
		addNeighbour(square, x - 1, y);
		addNeighbour(square, x + 1, y);
		addNeighbour(square, x, y - 1);
		addNeighbour(square, x, y + 1);
	}

	private void addNeighbour(Square square, int x, int y) {
		if (x < 0 || x >= world.length || y < 0 || y >= world[0].length)
			return;
		square.addNeighbour(world[x][y]);
	}

	public Square getStart() {
		return start;
	}

	public Square getRandomSquare() {
		if (freeSlots.size() == 0) {
			throw new RuntimeException("No more free slots");
		}
		Random r = new Random();
		
		Point p = freeSlots.remove(r.nextInt(freeSlots.size()));
		
		return world[p.x][p.y];
	}

	public void addAll(ArrayList<Stuff> stuff) {
		for (int x = 0; x < world.length; x++) {
			for (int y = 0; y < world[0].length; y++) {
				stuff.add(world[x][y]);
			}
		}
	}
}
