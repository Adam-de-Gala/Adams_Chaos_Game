package chaos_game;

import java.util.ArrayList;

public abstract class Fractal_Generator
{
	int numPoints = 0;
	int width;
	int height;
	ArrayList<Point> startingPoints = new ArrayList<Point>();
	
	public Fractal_Generator(int num, int width, int height)
	{
		System.out.println(num + " " + width + " " + height);
		this.numPoints = num;
		this.width = width;
		this.height = height;
		setUpPoints();
	}
	
	public Point distance(Point start, Point target, double factor)
	{
		Point temp = new Point((int) ((start.x + target.x)*factor),(int) ((start.y + target.y)*factor));	
		return temp;
	}
	
	
	public abstract void setUpPoints();
	public abstract Point nextPoint();


}
