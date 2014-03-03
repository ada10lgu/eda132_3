package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public class Arrow extends Stuff {

	public Arrow(int i) {
		super("" + i);
	}

	@Override
	public ArrayList<DataValue> getRules() {
		return new ArrayList<DataValue>();
	}

	@Override
	public DataValue getDefinition() {
		return new DataValue("ARROW", getName());
	}

	@Override
	protected String getPrefix() {
		return "a";
	}

}
