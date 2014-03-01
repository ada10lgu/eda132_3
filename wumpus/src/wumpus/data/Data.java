package wumpus.data;

public abstract class Data {

	protected String name;
	protected final String nl;

	public Data(String name) {
		this.name = name;
		nl = System.getProperty("line.separator");
	}

	protected void addTabs(StringBuilder sb, int n) {
		for (int i = 0; i < n; i++)
			sb.append("\t");
	}

	@Override
	public String toString() {
		return treeToString(0);
	}

	protected abstract String treeToString(int depth);
}
