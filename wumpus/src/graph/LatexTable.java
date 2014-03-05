package graph;

import java.io.File;
import java.io.FileNotFoundException;

public class LatexTable {
	public static void main(String[] args) throws FileNotFoundException {
		
		Graph g1 = new Graph(new File("files/tyre_ins"));
		Graph g2 = new Graph(new File("files/tyre_time"));
		
		
		System.out.println(new LatexTable(g1,g2).toLatex());
	}
	
	private Graph ins,time;
	
	public LatexTable(Graph ins, Graph time) {
		this.ins = ins;
		this.time = time;
		
	}
	
	public String toLatex() {
		String nl = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		
		sb.append("\\begin{tabular}{| c || c | c |}").append(nl);
		sb.append("\\hline").append(nl);
		sb.append("Input & \\multicolumn{2}{| c |}{Output} \\\\\\hline").append(nl);
		sb.append("i & Instructions & Time \\\\\\hline\\hline").append(nl);
		for (int i = ins.getMinI(); i <= ins.getMaxI(); i++) {
			sb.append(i);
			sb.append(" & ");
			sb.append(ins.get(i));
			sb.append(" & ");
			sb.append(time.get(i));
			sb.append(" \\\\\\hline").append(nl);
			
		}
		
		sb.append("\\end{tabular}").append(nl);
		return sb.toString();
	}
	
	
	@Override
	public String toString() {
		String nl = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();

		
		
		sb.append(ins.getName()).append(nl);
		sb.append("\tInst\tTime").append(nl);
		for (int i = ins.getMinI(); i <= ins.getMaxI(); i++) {
			sb.append(i).append("\t").append(ins.get(i)).append("\t").append(time.get(i)).append(nl);
		}
		return sb.toString();
	}
}
