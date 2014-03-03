package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public class Square extends Stuff {

	int x, y;

	ArrayList<Square> neighbours;
	boolean safe;
	boolean breeze;
	boolean stench;
	
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
	
	public void markSafe() {
		safe = true;
	}
	
	public void isWumpus() {
		for (Square s: neighbours)
			s.stench = true;
	}
	
	public void isPit() {
		for (Square s: neighbours)
			s.breeze = true;
	}
	
	@Override
	public ArrayList<DataValue> getRules() {
		ArrayList<DataValue> dv = new ArrayList<DataValue>();
		if (!safe){
			dv.add(new DataValue("possiblePit",getName()));
			dv.add(new DataValue("possibleWumpus",getName()));
		}

		if (stench)
			dv.add(new DataValue("stench",getName()));
		if (breeze)
			dv.add(new DataValue("breeze",getName()));
		for (Square s : neighbours) {
			dv.add(new DataValue("adjecent",getName(),s.getName()));
		}
		return dv;

	}

}
