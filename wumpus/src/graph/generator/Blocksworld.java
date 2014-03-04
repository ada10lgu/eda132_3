package graph.generator;

import graph.program.GeneratorProgram;

import java.io.IOException;

public class Blocksworld extends Generator {

	private String n;
	private String program;
	private String domain;
	
	
	public Blocksworld(int n) {
		this.n = "" + n;
		program = "repo/files/Planning/Blocksworld_32bit/blocksworld";
		domain = GeneratorProgram.GENERATOR_SUB_FOLDER
				+ "repo/files/Planning/Blocksworld_32bit/domain.pddl";
	}
	
	
	
	
	protected Duplet<Double, Integer> run() throws IOException {
		return run(program,domain,n);
	}
}
