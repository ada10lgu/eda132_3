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
			
			FontMetrics fm = g.getFontMetrics();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.BLACK);
			
			g.drawLine(40, 20, 40, getHeight()-20);
			g.drawLine(40, getHeight()-20, getWidth()-20, getHeight()-20);
			
			int height = getHeight()-40;
			int startY = getHeight()-20;
			
			double dx = (double)(getWidth()-60)/(graph.getMaxI()-graph.getMinI()+1);
			
			int oldX = 40;
			int oldY = startY;
			g.drawString(graph.getName(), 30, 15);
			for (int i = graph.getMinI(); i <= graph.getMaxI(); i++ ) {
				double value = graph.get(i);
				
				int newX = (int)(40+(i*dx));
				int newY = startY - (int)((value/graph.getMaxValue())*height);
				
				g.drawLine(oldX,oldY, newX, newY);
				g.drawLine(newX, startY-5, newX, startY+5);
				String text = ""+i;
				g.drawString(text, newX-fm.stringWidth(text)/2, startY+15);
				
				oldX = newX;
				oldY = newY;
			}
			
			for (int i = 10; i <= graph.getMaxValue(); i+=10) {
				int x = 40;
				int y = startY - (int)((i/graph.getMaxValue())*height);
				
				g.drawLine(x-5, y, x+5, y);
				String text = "" + i;
				g.drawString(text, x-7-fm.stringWidth(text), y+fm.getHeight()/2);
				
			}
		}
	}
}
