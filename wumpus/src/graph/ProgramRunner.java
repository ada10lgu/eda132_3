package graph;

import graph.generator.Blocksworld;
import graph.generator.Generator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramRunner {
	public static void main(String[] args) throws IOException {
		String name = "Blocksworld";
		Graph g = new Graph(name);
		
		PrintWriter pw = new PrintWriter(new File("files/"+name));
		pw.printf("%s\n",name);
		for (int i = 2; i <= 2;i++) {
			Generator block = new Blocksworld(i);
			double value =block.avg(1); 
			g.add(i, value);
			pw.printf("%d\t%f\n",i,value);
			pw.flush();
			System.out.println(i);
		}
		pw.close();
		System.out.println(g);
	}
}
