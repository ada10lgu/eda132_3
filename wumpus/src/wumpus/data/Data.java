package wumpus.data;

public abstract class Data  {

	protected String name;
	protected final String nl; 
	
	public Data(String name) {
		this.name = name;
		nl = System.getProperty("line.separator");
	}
	
	public String treeToString() {
		return treeToString(0);
	}
	
	protected void addTabs(StringBuilder sb, int n) {
		for (int i = 0; i < n; i++) {
			sb.append("\t");
		}
	}
	
	protected abstract String treeToString(int depth);
}
