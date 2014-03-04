package graph;

import java.io.File;
import java.io.IOException;

import graph.generator.Logistics;
import graph.program.FFProgram;
import graph.program.GeneratorProgram;
import graph.program.Program;

public class Tester {
	public static void main(String[] args) throws IOException {
		
		String airplane = "1";
		String city = "1";
		String citySize = "2";
		String packages = "3";
		
		String program = "repo/files/Planning/Logistics/GENERATOR_32bit/logistics";
		String domain = GeneratorProgram.GENERATOR_SUB_FOLDER
				+ "repo/files/Planning/Logistics/domain.pddl";
		
		Program generator = new GeneratorProgram(program, "-a", airplane, "-c", city, "-s",citySize,"-p",packages);
		File tempFile = generator.outputToFile();
		FFProgram ff = new FFProgram(tempFile, domain);
		
		tempFile.delete();

		System.out.println(ff.getInstructions());
	}
}
