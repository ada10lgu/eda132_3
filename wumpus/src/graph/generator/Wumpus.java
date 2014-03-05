package graph.generator;

import graph.program.FFProgram;
import graph.program.GeneratorProgram;
import graph.program.Program;

import java.io.File;
import java.io.IOException;

public class Wumpus extends Generator {

	String[] args;
	
	public Wumpus(int size, int gold, int pits, int wumpus) {
		args = new String[10];
		args[0] = "-w";
		args[1] = "" + size;
		args[2] = "-h";
		args[3] = "" + size;
		args[4] = "-g";
		args[5] = "" + gold;
		args[6] = "-p";
		args[7] = "" + pits;
		args[8] = "-u";
		args[9] = "" + wumpus;
	}
	
	@Override
	protected Duplet<Double, Integer> run() throws IOException {
		wumpus.Wumpus.main(args);
		File tempFile =  new File("files/wumpus.pddl");
		File domain = new File("files/domain.pddl");
		FFProgram ff = new FFProgram(tempFile, domain.getAbsolutePath());
		tempFile.delete();
		
		Duplet<Double, Integer> d = new Duplet<Double, Integer>(ff.getTime(), ff.getInstructions());
		
		return d;
	}

}
