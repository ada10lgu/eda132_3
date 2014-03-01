package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public class Gold extends Stuff {

	Square at;
	
	public Gold(int n,Square at) {
		super("" + n);
		this.at = at;
	}

	@Override
	public ArrayList<DataValue> getRules() {
		ArrayList<DataValue> dv = new ArrayList<DataValue>();
		dv.add(new DataValue("lies",getName(),at.getName()));
		return dv;
	}

	@Override
	
	public DataValue getDefinition() {
		return new DataValue("GOLD", getName());
	}

	@Override
	protected String getPrefix() {
		return "g";
	}

}
