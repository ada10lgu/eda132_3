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

	private Graph[] graphs;
	private Color[] colors = new Color[]{Color.BLUE,Color.GREEN,Color.PINK,Color.RED};	
	
	public static void main(String[] args) throws FileNotFoundException {
		Graph graph1 = new Graph(new File("files/Log_packages_ins"));
		Graph graph2 = new Graph(new File("files/Log_citySize_ins"));
		Graph graph3 = new Graph(new File("files/Log_city_ins"));
		Graph graph4 = new Graph(new File("files/Log_airplane_ins"));

		new GraphViewer(graph1, graph2, graph3, graph4);
	}

	public GraphViewer(Graph... graph) {
		this.graphs = graph;
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

			g.drawLine(40, 20, 40, getHeight() - 20);
			g.drawLine(40, getHeight() - 20, getWidth() - 20, getHeight() - 20);

			int height = getHeight() - 40;
			int startY = getHeight() - 20;

			int min = -1;
			int max = 0;
			double mvalue = 0;
			for (Graph graph : graphs) {
				if (graph.getMaxI() > max)
					max = graph.getMaxI();
				if (graph.getMinI() < min)
					min = graph.getMinI();
				if (graph.getMaxValue() > mvalue)
					mvalue = graph.getMaxValue();

			}
			double dx = (double) (getWidth() - 60) / (max - min);

			int n = 0;
			for (Graph graph : graphs) {

				int oldX = 40;
				int oldY = startY;
				g.setColor(colors[n]);
				g.drawString(graph.getName(), 45, 25+n*fm.getHeight());
				for (int i = graph.getMinI(); i <= graph.getMaxI(); i++) {
					double value = graph.get(i);

					int newX = (int) (40 + (i * dx));
					int newY = startY - (int) ((value / mvalue) * height);

					g.setColor(colors[n]);
					g.drawLine(oldX, oldY, newX, newY);
					
					g.setColor(Color.BLACK);
					g.drawLine(newX, startY - 5, newX, startY + 5);
					String text = "" + i;
					int textWidth = fm.stringWidth(text);
					g.drawString(text, newX - (textWidth / 2), startY + 15);

					oldX = newX;
					oldY = newY;
				}
				n++;
			}
			for (int i = 10; i <= mvalue; i += 10) {
				int x = 40;
				int y = startY - (int) ((i / mvalue) * height);

				g.drawLine(x - 5, y, x + 5, y);
				String text = "" + i;
				g.drawString(text, x - 7 - fm.stringWidth(text),
						y + fm.getHeight() / 2);

			}
		}
	}
}
