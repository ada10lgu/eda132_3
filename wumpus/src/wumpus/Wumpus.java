package wumpus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Wumpus {
	public static void main(String[] args) {

		if (args.length == 0)
			printErr("");

		if (args.length != 10)
			printErr("wrong ammount of arguments");

		int width = -1;
		int height = -1;
		int gold = -1;
		int pit = -1;
		int wompus = -1;
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
					case 'p':
						pit = Integer.parseInt(args[++i]);
						break;
					case 'u':
						wompus = Integer.parseInt(args[++i]);
						break;
						
					default:
						printErr("illegal setting");
					}
				}
			}
		} catch (Exception e) {
			printErr("illegal number");
		}

		if (width < 2 || height < 2 || gold < 1 || pit < 0 || wompus < 0)
			printErr("did not match minimar requirements");

		Problem p = new Problem(width, height, gold, pit,wompus);
		System.out.println(p);

		try {
			File f = new File("testfiles/wumpus/wumpus.pddl");
			PrintWriter pw;
			pw = new PrintWriter(f);
			pw.print(p.toString());
			pw.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not store to file");
			e.printStackTrace();
		}
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
		System.out.println("-p pits");
		System.out.println("-u wumpus");
		System.out.println();
		System.out.println("//the developers");
		System.exit(0);
	}
}
