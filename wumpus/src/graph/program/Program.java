package graph.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public abstract class Program {

	String data;
	
	public Program(String name, String... args) throws IOException {
		String[] input = new String[args.length + 1];
		input[0] = name;
		int i = 1;
		for (String s : args) {
			input[i++] = s;
		}
		Process process = new ProcessBuilder(input).start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
			sb.append(System.getProperty("line.separator"));
			
		}
		data = sb.toString();
	}

	@Override
	public String toString() {
		return data;
	}

	public File outputToFile() throws FileNotFoundException {
		String filename = "files/" + data.hashCode();
		File f = new File(filename);
		PrintWriter pw = new PrintWriter(f);
		
		pw.print(toString());
		pw.close();
		return f;
	}

}
