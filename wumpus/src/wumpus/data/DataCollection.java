package wumpus.data;

import java.util.ArrayList;

public class DataCollection extends Data {

	private ArrayList<Data> data;

	public DataCollection(String name) {
		super(name);
		data = new ArrayList<Data>();
	}

	public void addData(Data d) {
		data.add(d);
	}

	@Override
	protected String treeToString(int depth) {
		StringBuilder sb = new StringBuilder();
		addTabs(sb, depth);
		sb.append("(").append(name).append(nl);
		for (Data d : data)
			sb.append(d.treeToString(depth + 1)).append(nl);
		addTabs(sb, depth);
		sb.append(")");
		return sb.toString();
	}

	public void addData(ArrayList<DataValue> list) {
		for (DataValue dv : list)
			addData(dv);
	}

}
