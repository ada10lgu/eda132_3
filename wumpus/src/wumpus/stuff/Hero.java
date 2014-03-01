package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public class Hero extends Stuff {
	
	Square from;
	
	public Hero(String name, Square from) {
		super(name);
		this.from = from;
	}

	@Override
	protected String getPrefix() {
		return "h";
	}

	@Override
	public DataValue getDefinition() {
		return new DataValue("HERO", getName());
	}

	@Override
	public ArrayList<DataValue> getRules() {
		ArrayList<DataValue> dv = new ArrayList<DataValue>();
		dv.add(new DataValue("at",getName(),from.getName()));
		return dv;
	}

}
