package graph;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphViewer extends JFrame {

	private Graph graph;
	
	public static void main(String[] args) throws FileNotFoundException {
		Graph graph = new Graph(new File("files/tyreworld"));
		new GraphViewer(graph);
	}

	public GraphViewer(Graph graph) {
		this.graph = graph;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);

		add(new drawingPane());

		setVisible(true);

	}

	private class drawingPane extends JPanel {
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.BLACK);
			
			g.drawLine(20, 20, 20, getHeight()-20);
			g.drawLine(20, getHeight()-20, getWidth()-20, getHeight()-20);
			
			int height = getHeight()-40;
			int startY = getHeight()-20;
			
			double dx = (double)(getWidth()-40)/(graph.getMaxI()-graph.getMinI()+1);
			
			int oldX = 20;
			int oldY = startY;
			
			FontMetrics fm = g.getFontMetrics();
			
			g.drawString(graph.getName(), 15, 15);
			
			
			for (int i = graph.getMinI(); i <= graph.getMaxI(); i++ ) {
				double value = graph.get(i);
				
				int newX = (int)(20+(i*dx));
				int newY = startY - (int)((value/graph.getMaxValue())*height);
				
				g.drawLine(oldX,oldY, newX, newY);
				g.drawLine(newX, startY-5, newX, startY+5);
				String text = "" + i;
				int textWidth = fm.stringWidth(text);
				g.drawString(text, newX-(textWidth/2), startY+15);
				
				oldX = newX;
				oldY = newY;
			}
		}
	}
}
