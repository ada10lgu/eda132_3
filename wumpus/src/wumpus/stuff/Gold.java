package wumpus.stuff;

public class Gold extends Stuff {

	Square at;
	
	public Gold(int n,Square at) {
		super("" + n);
		this.at = at;
	}

	@Override
	public String getRules() {
		return "(lies " + getName() + " " + at.getName() + ")\n";
	}

	@Override
	public String getDefinition() {
		return "(GOLD " + getName() + ")";
	}

	@Override
	protected String getPrefix() {
		return "g";
	}

}
