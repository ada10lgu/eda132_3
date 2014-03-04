package graph.generator;

import graph.program.GeneratorProgram;

import java.io.IOException;

public class Logistics extends Generator {

	private String airplane, city, citySize, packages;
	private String program;
	private String domain;

	public Logistics(int airplane, int city, int citySize, int packages) {
		this.airplane = "" + airplane;
		this.city = "" + city;
		this.citySize = "" + citySize;
		this.packages = "" + packages;
		program = "repo/files/Planning/Logistics/GENERATOR_32bit/logistics";
		domain = GeneratorProgram.GENERATOR_SUB_FOLDER
				+ "repo/files/Planning/Logistics/domain.pddl";
	}

	protected Duplet<Double, Integer> run() throws IOException {
		return run(program, domain, "-a", airplane, "-c", city, "-s",citySize,"-p",packages);
	}
}
