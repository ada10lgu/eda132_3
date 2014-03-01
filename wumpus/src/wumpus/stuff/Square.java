package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

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
	public DataValue getDefinition() {
		return new DataValue("SQUARE",getName());
	}

	public void addNeighbour(Square s) {
		neighbours.add(s);
	}
	
	@Override
	public ArrayList<DataValue> getRules() {
		ArrayList<DataValue> dv = new ArrayList<DataValue>();
		for (Square s : neighbours) {
			dv.add(new DataValue("besides",getName(),s.getName()));
		}
		return dv;

	}

}
