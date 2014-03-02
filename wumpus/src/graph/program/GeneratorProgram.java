package graph.program;

import java.io.IOException;

public class GeneratorProgram extends Program {

	public final static String GENERATOR_SUB_FOLDER = "/home/mezz/Documents/eda132/eda132_3/files/Planning/";
	
	public GeneratorProgram(String name, String... args) throws IOException {
		super(GENERATOR_SUB_FOLDER + name, args);
	}

	
	
}
