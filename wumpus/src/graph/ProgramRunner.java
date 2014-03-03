package graph;

import graph.generator.Generator;
import graph.generator.Tyreworld;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramRunner {
	public static void main(String[] args) throws IOException {
		String name = "Blocksworld";
		Graph g = new Graph(name);
		
		PrintWriter pw = new PrintWriter(new File("files/"+name));
		pw.printf("%s\n",name);
		for (int i = 1; i <= 50;i++) {
			Generator tyre = new Tyreworld(i);
			double value =tyre.avg(10); 
			g.add(i, value);
			pw.printf("%d\t%f\n",i,value);
			pw.flush();
			System.out.println(i);
		}
		pw.close();
		System.out.println(g);
	}
}
