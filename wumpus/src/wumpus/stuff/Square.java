package wumpus.stuff;

import java.util.ArrayList;

public class Square extends Stuff {

	int x, y;

	ArrayList<Square> neighbours;
	
	public Square(int x, int y) {
		super(x + "-" + y);
		this.x = x;
		this.y = y;
		neighbours = new ArrayList<Square>();
	}

	@Override
	protected String getPrefix() {
		return "s";
	}

	@Override
	public String getDefinition() {
		return "(SQUARE " + getName() + ")";
	}

	public void addNeighbour(Square s) {
		neighbours.add(s);
	}
	
	@Override
	public String getRules() {
		StringBuilder sb = new StringBuilder();
		for (Square s : neighbours) {
			sb.append("(besides ").append(getName()).append(" ").append(s.getName()).append(")\n");
		}
		return sb.toString();

	}

}
