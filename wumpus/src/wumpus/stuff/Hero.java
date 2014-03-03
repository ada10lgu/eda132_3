package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public class Hero extends Stuff {
	
	Square from;
	Arrow a;
	
	public Hero(String name, Square from,Arrow a) {
		super(name);
		this.from = from;
		this.a = a ;
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
		dv.add(new DataValue("hold",getName(),a.getName()));
		return dv;
	}

}
