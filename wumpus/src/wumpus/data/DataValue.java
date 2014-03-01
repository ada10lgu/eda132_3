package wumpus.data;

import java.util.ArrayList;

public class DataValue extends Data {

	private ArrayList<String> values;
	
	public DataValue(String name, String... startValues) {
		super(name);
		values = new ArrayList<String>();
		for (String s: startValues) {
			values.add(s);
		}
	}


	@Override
	protected String treeToString(int depth) {
		StringBuilder sb = new StringBuilder();
		addTabs(sb, depth);
		sb.append("(").append(name);
		for (String s : values) {
			sb.append(" ").append(s);
		}
		sb.append(")");
		return sb.toString();
	}


	public void addValue(String value) {
		values.add(value);
	}
	
}
