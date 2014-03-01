package wumpus.stuff;

import java.util.ArrayList;

import wumpus.data.DataValue;

public abstract  class Stuff {

	protected String name;
	
	public Stuff(String name) {
		this.name = name;
	}
	
	public String getName() {
		return getPrefix() + name;
	}
	
	public abstract ArrayList<DataValue> getRules();
	
	public abstract DataValue getDefinition();
	
	protected abstract String getPrefix();
}
