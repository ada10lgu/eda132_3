package graph.generator;

import graph.program.FFProgram;
import graph.program.GeneratorProgram;
import graph.program.Program;

import java.io.File;
import java.io.IOException;

public abstract class Generator {

	public double avg(int n) throws IOException {
		double total = 0;
		for (int i = 0; i < n; i++)
			total += run();
		return total / n;
	}

	protected abstract double run() throws IOException;

	protected double run(String program, String domain, String... args)
			throws IOException {
		Program generator = new GeneratorProgram(program, args);
		File tempFile = generator.outputToFile();

		FFProgram ff = new FFProgram(tempFile, domain);
		tempFile.delete();
		return ff.getTime();
	}
}
