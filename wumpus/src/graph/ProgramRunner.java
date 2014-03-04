package graph;

import graph.generator.Blocksworld;
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
		
		int min = 2;
		int max = 15;
		int times = 2;
		
		for (int i = min; i <= max;i++) {
			Generator tyre = new Blocksworld(i);
			double value =tyre.avg(times); 
			g.add(i, value);
			pw.printf("%d\t%f\n",i,value);
			pw.flush();
			System.out.print(i+" ");
		}
		System.out.println();
		pw.close();
		System.out.println(g);
	}
}
