package ShapeInheritance;

import java.awt.*;

/**
 * This class was taken from the lab. It's purpose is to draw
 * a circle in the Jframe. 
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 *
 */
public class Circle extends Shape
{
	//Instance Variables
	private double radius;
	
	/**
	 * Precondition: There are values in x and y
	 * 
	 * Postcondition: Goes to the Super class and sets x and y to that 
	 * super class. x and y are random numbers generated in the PolyDemo
	 * @param x
	 * @param y
	 */
	public Circle(int x, int y) 
	{
		super(x, y);
	}
	
	@Override
	/**
	 * Precondition: There is a value in the radius.
	 * 
	 * Postcondition: Returns the area of the circle presented in the 
	 * screen.
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
	 * is painted as well).
	 */
	public void paint(Graphics g)
	{
		//Type cast to 2D graphics
		Graphics2D g2d = (Graphics2D) g;
		
		//Make the color sky blue
		g2d.setColor(new Color(127, 218, 255));
		//Create the circular shape using the position and the width and height
		g2d.fillOval(100, 550, 250, 250);
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
