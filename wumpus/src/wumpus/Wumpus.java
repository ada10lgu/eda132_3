package wumpus;


public class Wumpus {
	public static void main(String[] args) {

		/*
		 * TODO ADD args definition of vars
		 */

		

		int width = 3;
		int height = 3;
		int nGold = 7;

		Problem p = new Problem(width,height,nGold);
		
		System.out.println(p);

	}

	
}
