package ShapeInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Violin extends Shape
{
	//Since finding a specific size of the violin is difficult, we'll 
	//approximate by base and height for rectangles.
	private double base;
	private double height;
	
	/**
	 * Precondition: There are values in x and y
	 * 
	 * Postcondition: Goes to the Super class and sets x and y to that 
	 * super class. x and y are random numbers generated in the PolyDemo
	 * 
	 * @param x
	 * @param y
	 */
	public Violin(int x, int y) 
	{
		super(x, y);
	}
	
	@Override
	/**
	 * Precondition: There is a value in base and height.
	 * 
	 * Postcondition: Returns the area of the square presented in the 
	 * screen. Since we don't know the exact area of the violin, we'll 
	 * approximate by finding the area of the rectangle that surrounds the 
	 * violin.
	 */
	public double getArea()
	{
		return base * height;
	}
	
	@Override
	/**
	 * Precondition: There Graphics g is not null
	 * 
	 * Postcondition: Creates and paints the shape (and the color if color
	 * is painted as well). Since this is a symbol, it requires a lot of 
	 * shapes.
	 */
	public void paint(Graphics g)
	{
		//Type cast to Graphics 2D
		Graphics2D g2d = (Graphics2D) g;
		
		/**
		 * Basic rundown for each method.
		 * 
		 * fillOval(xPosition, yPosition, Width, Height)
		 * fillRect(xPosition, yPosition, Width, Height);
		 * fillArc(xPosition, yPosition, Width, Height, startAngle, arcAngle)
		 */
		
		//Body of the Violin
		g2d.setColor(new Color(139, 69, 19));
		g2d.fillArc(800, 350, 110, 110, 340, 220);
		g2d.fillArc(790, 390, 130, 140, 170, 200);
		g2d.fillArc(790, 400, 60, 100, 250, 200);
		g2d.fillArc(860, 400, 60, 100, 90, 200);
		g2d.fillOval(835, 380, 40, 110);
		
		//Scroll
		g2d.fillRect(840, 240, 30, 50);
		g2d.fillOval(830, 215, 50, 30);
		
		//Neck and fingerboard of the violin
		g2d.setColor(Color.BLACK);
		g2d.fillRect(840, 280, 30, 130);
		
		//TailPiece of the Violin
		int xPos[] = {835, 875, 855};
		int yPos[] = {480, 480, 530};
		g2d.fillPolygon(xPos, yPos, 3);
		
		//Chinrest
		g2d.fillArc(800, 480, 60, 50, 140, 180);
		
		//Pegbox
		g2d.fillRect(845, 250, 20, 50);
		
		//Tuners
		g2d.fillOval(820, 240, 20, 20);
		g2d.fillOval(820, 260, 20, 20);
		g2d.fillOval(870, 240, 20, 20);
		g2d.fillOval(870, 260, 20, 20);
		
		//F holes
		g2d.drawLine(835, 420, 825, 460);
		g2d.drawLine(835, 440, 825, 440);
		g2d.fillOval(832, 416, 7, 7);
		g2d.fillOval(820, 458, 7, 7);
		
		g2d.drawLine(875, 420, 885, 460);
		g2d.drawLine(875, 440, 885, 440);
		g2d.fillOval(870, 416, 7, 7);
		g2d.fillOval(883, 458, 7, 7);
		
		//Strings
		g2d.setColor(Color.GRAY);
		//G String
		g2d.drawLine(845, 250, 845, 480);
		//D String
		g2d.drawLine(852, 250, 852, 480);
		//A String
		g2d.drawLine(859, 250, 859, 480);
		//E String
		g2d.drawLine(865, 250, 865, 480);
	}
	
	/**
	 * Precondition: There is a base.
	 * 
	 * Postcondition: Returns the base.
	 * @return base
	 */
	public double getBase()
	{
		return base;
	}

	/**
	 * Precondition: There is a base.
	 * 
	 * Postcondition: Sets a value in the base.
	 * 
	 * @param base
	 */
	public void setBase(double base)
	{
		this.base = base;
	}

	/**
	 * Precondition: There is a height.
	 * 
	 * Postcondition: Returns the height.
	 * @return height
	 */
	public double getHeight() 
	{
		return height;
	}

	/**
	 * Precondition: There is a height.
	 * 
	 * Postcondition: Sets a value in the height.
	 * 
	 * @param height
	 */
	public void setHeight(double height) 
	{
		this.height = height;
	}

}
