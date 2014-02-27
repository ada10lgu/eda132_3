package wumpus;

public abstract  class Stuff {

	protected String name;
	
	public Stuff(String name) {
		this.name = name;
	}
	
	public String getName() {
		return getPrefix() + name;
	}
	
	public abstract String getRules();
	
	public abstract String getDefinition();
	
	protected abstract String getPrefix();
}
