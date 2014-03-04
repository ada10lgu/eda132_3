package graph.generator;

import graph.program.GeneratorProgram;

import java.io.IOException;

public class Tyreworld extends Generator {

	private String n;
	private String program;
	private String domain;
	
	
	public Tyreworld(int n) {
		this.n = "" + n;
		program = "Tyreworld/GENERATOR_32bit/tyreworld";
		domain = GeneratorProgram.GENERATOR_SUB_FOLDER
				+ "Tyreworld/domain.pddl";
	}
	
	
	
	
	protected Duplet<Double, Integer> run() throws IOException {
		return run(program,domain,"-n",n);
	}
}
