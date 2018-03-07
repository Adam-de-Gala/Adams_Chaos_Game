package chaos_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Main extends JFrame {

	final static int HEIGHT = 500;
	final static int WIDTH  = 500;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	      MyJFrame f = new MyJFrame();
	      f.setTitle("Chaos Game - Fractal Generation");
	      f.setSize(WIDTH, HEIGHT);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	}
	
	static class MyJFrame extends JFrame implements MouseInputListener 
	{
		
		public void paint(Graphics g) 
		{
			int max = 20000;
			int numOfSteps = 100;
			//The maximum of i is the amount of points you have. 
			
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);
			
			//Fractal_Generator fractal = new Sierpinski_Triangle(3,500,500);
			Fractal_Generator fractal = new Barnsleys_Fern(3,500,500);
			
			for(int i=0; i<max; i++)
			{	
				//System.out.println("Here");
				Point p = fractal.nextPoint();

				if(p.Color == "Blue")
					g.setColor(Color.BLUE);
				if(p.Color == "Yellow")
					g.setColor(Color.YELLOW);
				if(p.Color == "Red")
					g.setColor(Color.RED);
				if(p.Color == "Green")
					g.setColor(Color.GREEN);
				if(p.Color == "Black")
					g.setColor(Color.BLACK);
				
				//System.out.println(p.x + " " + p.y);
			
				Shape l = new Line2D.Double(p.x, p.y, p.x, p.y);
                g2.draw(l);
				if(i% (max/numOfSteps) ==0)
				{
					System.out.println("Drawn " + i + " out  of " + max);
					try 
					{
						TimeUnit.MILLISECONDS.sleep(25);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		@Override
		public void mouseClicked(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
