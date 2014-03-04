package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Graph {

	private TreeMap<Integer, Double> data;
	private double maxValue = -1;
	private int minI = Integer.MAX_VALUE;
	private int maxI = Integer.MIN_VALUE;
	private String name;

	public Graph(String name) {
		this.name = name;
		data = new TreeMap<Integer, Double>();
	}

	public Graph(File f) throws FileNotFoundException {
		Scanner s = new Scanner(f);
		name = s.nextLine();
		data = new TreeMap<Integer, Double>();
		while (s.hasNext()) {
			String index = s.next();
			String value = s.next();
			
			int i = Integer.parseInt(index);
			double v = Double.parseDouble(value);
			add(i, v);
		}
		s.close();
	}

	public int getMinI() {
		return minI;
	}

	public int getMaxI() {
		return maxI;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void add(int i, double value) {
		data.put(i, value);
		if (i > maxI)
			maxI = i;
		if (i < minI)
			minI = i;
		if (value > maxValue)
			maxValue = value;
	}

	public double get(int i) {
		return data.get(i);
	}
	
	@Override
	public String toString() {
		String nl = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();

		sb.append(name).append(nl);
		sb.append("------").append(nl);
		for (int i : data.keySet())
			sb.append(i).append(":\t").append(data.get(i)).append(nl);
		sb.append("------").append(nl);
		return sb.toString();
	}

	public String getName() {
		return name;
	}

}
