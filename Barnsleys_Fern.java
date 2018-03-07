package chaos_game;

import java.util.ArrayList;

public class Barnsleys_Fern extends Fractal_Generator
{

	public Barnsleys_Fern(int num, int width, int height) {
		super(num, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setUpPoints() 
	{
		// TODO Auto-generated method stub
		 startingPoints.add(new Point(0, 0));
		 current = startingPoints.get(0);
		
	}

	Point current = new Point(0, 0);
	@Override
	public Point nextPoint() {
		// TODO Auto-generated method stub
		 double rand = Math.random();
		 
		 Point target = new Point(current.x, current.y);
		 //System.out.println("Rand is " + rand + " current is " + current.x + " " + current.y);
		 
         if (rand <= 0.01) 
         {
             target.x = 0;
             target.y = 0.16 * target.y;
         } 
         else if (rand <= 0.08) 
         {
             target.x = 0.2 * target.x - 0.26 * target.y;
             target.y = 0.23 * target.x + 0.22 * target.y + 1.6;
         } 
         else if (rand <= 0.15) 
         {
             target.x = -0.15 * target.x + 0.28 * target.y;
             target.y = 0.26 * target.x + 0.24 * target.y + 0.44;
         } 
         else 
         {
             target.x = 0.85 * target.x + 0.04 * target.y;
             target.y = -0.04 * target.x + 0.85 * target.y + 1.6;
         }
		 current.x = target.x;
		 current.y = target.y;
		 //System.out.println("Rand is " + rand + " current is " + current.x + " " + current.y + " " + width + " " + height);
		 target.Color = "Green";
		 
		 target.x = target.x*(width/10) + width/2 ;
		 target.y = height - (target.y * (height/10));
		 
		 //System.out.println("Rand is " + rand + " Target is " + target.x + " " + target.y);
		 return target;
	}

}
