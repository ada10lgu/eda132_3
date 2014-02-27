package wumpus;

public class Square extends Stuff {

	int x, y;
	Square[][] world;

	public Square(int x, int y, Square[][] world) {
		super(x + "-" + y);
		this.x = x;
		this.y = y;
		this.world = world;
	}

	@Override
	protected String getPrefix() {
		return "s";
	}

	@Override
	public String getDefinition() {
		return "(SQUARE " + getName() + ")";
	}

	@Override
	public String getRules() {
		StringBuilder sb = new StringBuilder();
		for (int d = -1; d <= 1; d += 2) {
			int dx = 0;
			int dy = d;

			try {

				Square to = world[x + dx][y + dy];

				sb.append("(besides ").append(getName()).append(" ")
						.append(to.getName()).append(")\n");

			} catch (IndexOutOfBoundsException e) {
			}

			dx = d;
			dy = 0;

			try {

				Square to = world[x + dx][y + dy];

				sb.append("(besides ").append(getName()).append(" ")
						.append(to.getName()).append(")\n");

			} catch (IndexOutOfBoundsException e) {
			}

		}
		return sb.toString();

	}

}
