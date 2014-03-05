package graph.generator;

import graph.program.FFProgram;
import graph.program.GeneratorProgram;
import graph.program.Program;

import java.io.File;
import java.io.IOException;

public abstract class Generator {

	public Duplet<Double, Integer> avg(int n) throws IOException {
		double totalRuntime = 0;
		int totalIntructions = 0;
		int fails = 0;
		int i = 0;
		for (; i < n && fails <= 10; i++) {
			Duplet<Double,Integer> d = run(); 
			if (d.e < 0) {
				i--;
				fails++;
				continue;
			}
			totalRuntime += d.e;
			totalIntructions += d.a;
		}
		
		return new Duplet<Double, Integer>(totalRuntime/i, totalIntructions/i);
	}

	protected abstract Duplet<Double, Integer> run() throws IOException;

	protected Duplet<Double, Integer> run(String program, String domain, String... args)
			throws IOException {
		Program generator = new GeneratorProgram(program, args);
		File tempFile = generator.outputToFile();

		FFProgram ff = new FFProgram(tempFile, domain);
		
		tempFile.delete();
		
		Duplet<Double, Integer> d = new Duplet<Double, Integer>(ff.getTime(), ff.getInstructions());
		
		return d;
	}
}
