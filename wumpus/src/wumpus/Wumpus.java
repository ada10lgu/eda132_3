package wumpus;

public class Wumpus {
	public static void main(String[] args) {

		if (args.length == 0)
			printErr("");

		if (args.length != 8)
			printErr("wrong ammount of arguments");

		int width = -1;
		int height = -1;
		int gold = -1;
		int wumpus = -1;
		try {
			for (int i = 0; i < args.length; i++) {
				if (args[i].startsWith("-")) {
					switch (args[i].charAt(1)) {
					case 'w':
						width = Integer.parseInt(args[++i]);
						break;
					case 'h':
						height = Integer.parseInt(args[++i]);
						break;
					case 'g':
						gold = Integer.parseInt(args[++i]);
						break;
					case 'u':
						wumpus = Integer.parseInt(args[++i]);
						break;
					default:
						printErr("illegal setting");
					}
				}
			}
		} catch (Exception e) {
			printErr("illegal number");
		}

		if (width < 2 || height < 2 || gold < 1 || wumpus < 0)
			printErr("did not match minimar requirements");

		Problem p = new Problem(width, height, gold);
		System.out.println(p);

	}

	private static void printErr(String s) {
		if (s != null && s.length() > 0) {
		System.out.println("Did not work due to:");
		System.out.println(" " + s);
		}
		System.out.println("Specify the following:");
		System.out.println("");
		System.out.println("-w width (min 2)");
		System.out.println("-h height (min 2)");
		System.out.println("-g gold (min 1)");
		System.out.println("-u wumpus");
		System.out.println();
		System.out.println("//the developers");
		System.exit(0);
	}
}
