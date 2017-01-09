package winter;
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractShape
{
   //instance variables
	private int xPos;
	private int yPos;

	private int width;
	private int height;

	private Color color;

	private int xSpeed;
	private int ySpeed;

   public AbstractShape(int x, int y, int wid, int ht)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = Color.WHITE;
		xSpeed = 0;
		ySpeed= 0;
   }
   
   public AbstractShape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = 0;
		ySpeed= 0;
   }   
   
   public AbstractShape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed= ySpd;
   }  
  
   public void setXYWH (int x2, int y2, int w2, int h2)
   {
	   xPos = x2;
	   yPos = y2;
	   width = w2;
	   height = h2;
   }
   
   
   public void setXPos( int xp)
   {
   	xPos = xp;
   }
   
   public void setYPos( int yp)
   {
   	yPos = yp;
   }
   
   public void setXSpeed( int xs)
   {
   	xSpeed = xs;
   }
   
   public void setYSpeed(int ys)
   {
   	ySpeed = ys;
   }
   
   public int getYSpeed()
   {
   	return ySpeed;
   }
   
   public int getXSpeed()
   {
   	return xSpeed;
   }
   
   public int getXPos()
   {
   	return xPos;
   }
   
   public int getYPos()
   {
   	return yPos;
   }
   
   public Color getColor()
   {
   	return color;
   }
   
   
   public void setWidth(int wid)
   {
	   width = wid;
   }
   
   public void setHeight(int hei)
   {
	   height = hei;
   }
   
   public int getWidth()
   {
   	return width;
   }
   
   public int getHeight()
   {
   	return height;
   }

   public abstract void draw(Graphics window);

   public abstract void moveAndDraw(Graphics window);

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}