package wumpus;

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
	public String getDefinition() {
		return "(HERO " + getName() + ")";
	}

	@Override
	public String getRules() {
		return "(at " + getName() + " " + from.getName() + ")\n";
	}

}
