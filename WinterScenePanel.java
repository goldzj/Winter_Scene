package winter;
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		
		//populate the list with 50 unique snowflakes
		for(int i = 0; i<50; i++)
		{
			int y = (int)(Math.random()*600+20);
			int speedY = (int)(Math.random()*5+2);
			int wid = (int)(Math.random()*20);
			int hei = wid;
			shapes.add(new FancySnowFlake(i*15, y, wid, hei, Color.WHITE, 5, speedY));
		}
		
		
		//instantiate a snowman
		sMan = new SnowMan(600,415,100,100);
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("Zach's Winter Scene",40,40);
		
		window.fillRect(0, 530, 1000, 50);
		Color one = new Color(240, 255, 255);
		window.setColor(one);
		window.fillRect(0, 480, 1000, 50);
		Color two = new Color(200, 255, 255);
		window.setColor(two);
		window.fillRect(0, 430, 1000, 50);
		
		//make the snowman appear
		sMan.draw(window);
		window.setColor(Color.WHITE);
		//make the snowflakes appear and move down the screen
		for (AbstractShape flake : shapes)
		{
			flake.moveAndDraw(window);
			//check to see if any of the snowflakes need to be reset to the top of the screen
			if(flake.getYPos() >= getHeight())
			{
				flake.setYPos(0);
			}
		}
		
		
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   			Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}