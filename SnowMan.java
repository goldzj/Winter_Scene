package winter;
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
	   window.setColor(Color.WHITE);
	      	
	   window.fillOval(600,415,100,100);
	   window.fillOval(610, 350, 80, 80);
	   window.fillOval(620, 300, 60, 60);
	   
	   window.setColor(Color.BLACK);
	   window.fillOval(642, 360, 15, 15);
	   window.fillOval(642, 380, 15, 15);
	   window.fillOval(642, 400, 15, 15);
	   window.fillOval(632, 318, 10, 10);
	   window.fillOval(652, 318, 10, 10);
	   
	   window.setColor(Color.ORANGE);
	   int x = 630;
	   int y = 335;
	   int[] noseX = {x-10, x+20, x+20};
	   int[] noseY = {y, y+5, y-5}; 
	   window.fillPolygon(noseX, noseY, 3);
   }

   public void moveAndDraw(Graphics window)
   {
      window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());   
   }
}