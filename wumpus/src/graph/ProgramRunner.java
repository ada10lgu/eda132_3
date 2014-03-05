package graph;

import graph.generator.Blocksworld;
import graph.generator.Duplet;
import graph.generator.Generator;
import graph.generator.Logistics;
import graph.generator.Tyreworld;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramRunner {
	public static void main(String[] args) throws IOException {

//		makeLogistics("Log_airplane", 1);
//		makeLogistics("Log_city", 2);
//		makeLogistics("Log_citySize", 3);
//		makeLogistics("Log_packages", 4);
//		makeTyre("Tyre");
		makeBlock("Block");
	}

	public static void makeLogistics(String name, int a) throws IOException {
		System.out.println("Working on" + name);
		Graph g = new Graph(name);

		PrintWriter pwTime = new PrintWriter(
				new File("files/" + name + "_time"));
		pwTime.printf("%s\n", name);
		PrintWriter pwInstructions = new PrintWriter(new File("files/" + name
				+ "_ins"));
		pwInstructions.printf("%s\n", name);

		int min = 1;
		int max = 25;
		int times = 25;

		for (int i = min; i <= max; i++) {
			Generator gen = null;
			switch (a) {
			case 1:
				gen = new Logistics(i, 10, 10, 10);
				break;
			case 2:
				gen = new Logistics(10, i, 10, 10);
				break;
			case 3:
				gen = new Logistics(10, 10, i, 10);
				break;
			case 4:
				gen = new Logistics(10, 10, 10, i);
				break;
			}
			Duplet<Double, Integer> duplet = gen.avg(times);
			double value = duplet.e;
			g.add(i, value);
			pwTime.printf("%d\t%f\n", i, value);
			pwTime.flush();
			pwInstructions.printf("%d\t%d\n", i, duplet.a);
			pwInstructions.flush();
			System.out.print(i + " ");
		}
		System.out.println();
		pwTime.close();
		pwInstructions.close();
		System.out.println(g);
	}

	public static void makeTyre(String name) throws IOException {
		System.out.println("Working on" + name);
		Graph g = new Graph(name);

		PrintWriter pwTime = new PrintWriter(
				new File("files/" + name + "_time"));
		pwTime.printf("%s\n", name);
		PrintWriter pwInstructions = new PrintWriter(new File("files/" + name
				+ "_ins"));
		pwInstructions.printf("%s\n", name);

		int min = 1;
		int max = 25;
		int times = 10;

		for (int i = min; i <= max; i++) {
			Generator gen = null;
			gen = new Tyreworld(i);
			Duplet<Double, Integer> duplet = gen.avg(times);
			double value = duplet.e;
			g.add(i, value);
			pwTime.printf("%d\t%f\n", i, value);
			pwTime.flush();
			pwInstructions.printf("%d\t%d\n", i, duplet.a);
			pwInstructions.flush();
			System.out.print(i + " ");
		}
		System.out.println();
		pwTime.close();
		pwInstructions.close();
		System.out.println(g);
	}
	
	public static void makeBlock(String name) throws IOException {
		System.out.println("Working on" + name);
		Graph g = new Graph(name);

		PrintWriter pwTime = new PrintWriter(
				new File("files/" + name + "_time"));
		pwTime.printf("%s\n", name);
		PrintWriter pwInstructions = new PrintWriter(new File("files/" + name
				+ "_ins"));
		pwInstructions.printf("%s\n", name);

		int min = 2;
		int max = 25;
		int times = 10;

		for (int i = min; i <= max; i++) {
			Generator gen = null;
			gen = new Blocksworld(i);
			Duplet<Double, Integer> duplet = gen.avg(times);
			double value = duplet.e;
			g.add(i, value);
			pwTime.printf("%d\t%f\n", i, value);
			pwTime.flush();
			pwInstructions.printf("%d\t%d\n", i, duplet.a);
			pwInstructions.flush();
			System.out.print(i + " ");
		}
		System.out.println();
		pwTime.close();
		pwInstructions.close();
		System.out.println(g);
	}
}
