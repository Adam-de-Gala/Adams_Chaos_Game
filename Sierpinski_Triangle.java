package chaos_game;

public class Sierpinski_Triangle extends Fractal_Generator {

	
	public Sierpinski_Triangle(int num, int width, int height) 
	{
		super(num, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setUpPoints() 
	{
		// TODO Auto-generated method stub
		
		startingPoints.add(new Point(0,height));
		startingPoints.add(new Point(width,height));
		startingPoints.add(new Point(width/2,0));
	}

	Point current = new Point(-1, -1);
	int lastVertex = -1;
	boolean black = false;
	@Override
	public Point nextPoint() 
	{
		int rand = (int) (Math.random() * startingPoints.size());
		
//		while(rand == lastVertex) // :(
//			 rand = (int) (Math.random() * startingPoints.size());
//		
//		lastVertex = rand;
		
		Point target = startingPoints.get(rand);
		
		if(current.x == -1 && current.y == -1)
			current = target; 
		
		Point destination  = distance(current, target, .5);
		
		
		
		if(rand == 0)
			destination.Color = "Blue";
		if(rand == 1)
			destination.Color = "Green";
		if(rand == 2)
			destination.Color = "Red";
		
		if(black == true)
			destination.Color = "Black";
		
		current = destination;
		
		return destination;
	}

}
