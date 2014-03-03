package graph.generator;

import graph.program.GeneratorProgram;

import java.io.IOException;

public class Blocksworld extends Generator {

	private String n;
	private String program;
	private String domain;
	
	
	public Blocksworld(int n) {
		this.n = "" + n;
		program = "Blocksworld/blocksworld";
		domain = GeneratorProgram.GENERATOR_SUB_FOLDER
				+ "Blocksworld/domain.pddl";
	}
	
	
	
	
	protected double run() throws IOException {
		return run(program,domain,n);
	}
}
