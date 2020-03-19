package ShapeInheritance;

import java.awt.*;

/**
 * This is the Symbol class. This will paint/draw a symbol to the
 * JFrame.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 *
 */
public class Symbol extends Shape
{
	//Instance variables
	private double radius;
	
	/**
	 * Precondition: There are values in x and y
	 * 
	 * Postcondition: Goes to the Super class and sets x and y to that 
	 * super class. x and y are random numbers generated in the PolyDemo
	 * @param x
	 * @param y
	 */
	public Symbol(int x, int y)
	{
		super(x, y);
	}
	
	@Override
	/**
	 * Precondition: There is a value in the radius.
	 * 
	 * Postcondition: Returns the area of the circle presented in the 
	 * screen. Since the Symbol is surrounded by a circular shape, it is 
	 * best to just get the area of the circle.
	 */
	public double getArea()
	{
		return Math.PI * radius * radius;
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
		
		//This is the outer circle with the black filling 
		g2d.setColor(Color.BLACK);
		g2d.fillOval(25, 25, 500, 500);
	
		//This is the inner circle with white filling
		g2d.setColor(Color.WHITE);
		g2d.fillOval(45, 45, 460, 460);
		
		//Left symbol
		g2d.setColor(Color.BLACK);
		g2d.fillRect(140, 100, 35, 350);
		g2d.fillOval(140, 430, 35, 45);
		g2d.fillOval(130, 80, 45, 50);
		g2d.fillArc(70, 150, 55, 225, 225, 180);
		g2d.fillArc(160, 215, 50, 125, 280, 220);
		
		//Top Right Line
		g2d.fillRect(220, 120, 150, 35);
		g2d.fillOval(300, 105, 130, 50);
		g2d.fillArc(190, 84, 80, 72, 180, 180);
		
		//This creates the "Square" in the middle
		g2d.fillRect(200, 280, 250, 30);
		g2d.fillRect(260, 130, 37, 180);
		g2d.fillOval(350, 190, 40, 120);
		g2d.fillOval(220, 190, 160, 30);
		g2d.fillArc(330, 185, 60, 50, 290, 210);
		g2d.fillArc(210, 160, 80, 65, 180, 180);
		
		//Middle line arc at the right end
		g2d.fillArc(400, 268, 80, 42, 270, 290);
		
		//This is the Square at the very bottom
		g2d.fillRect(230, 340, 170, 110);
		g2d.fillOval(230, 430, 40, 30);
		g2d.fillOval(370, 430, 30, 30);
		g2d.fillArc(366, 333, 40, 54, 310, 190);
		g2d.fillArc(220, 330, 60, 60, 350, 180);
		
		//The square at the bottom that is the white space.
		g2d.setColor(Color.WHITE);
		g2d.fillRect(270, 370, 100, 50);
	}
	
	/**
	 * Precondition: There is a radius.
	 * 
	 * Postcondition: Returns the radius.
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}

	/**
	 * Precondition: There is a radius.
	 * 
	 * Postcondition: Sets a value in the radius.
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	
}
