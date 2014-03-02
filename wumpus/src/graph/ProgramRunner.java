package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProgramRunner {
	public static void main(String[] args) throws IOException {

		String program = "/home/mezz/Documents/eda132/eda132_3/files/Planning/Tyreworld/GENERATOR_32bit/tyreworld";
		// "-n", "2"
		 System.out.println(runProgram("", program, "-n", "2"));

		
	}

	public static int runProgram(String define, String... prog) {
		Process process;
		try {
			process = new ProcessBuilder(prog).start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;

			String ff = "/home/mezz/Documents/eda132/eda132_3/files/Planning/FF-X/ff"; 
			
			Process ffProg = new ProcessBuilder(ff).start();
			
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			return -1;
		}

		return 0;
	}
	
	private abstract class Prog {
		
		
		public Prog(String... input) {
			
		}
		
	}
}
