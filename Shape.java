package ShapeInheritance;

import java.awt.*;

/**
 * This class is the parent class called Shape. Its main purpose is to be here.
 * The subclasses are the ones that will override the methods and polymorphism
 * will determine which methods to use. This is a general super class that 
 * relies on the subclasses to work. 
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 */
public class Shape extends Object 
{
	//Instance variables
	private int x;
	private int y;
	private Color myColor;
	
	/**
	 * Precondition: There are values in the parameter.
	 * 
	 * Postcondition: This sets the position of the shape.
	 * 
	 * @param x
	 * @param y
	 */
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * As a default, since we don't know this shape, set it to -1.
	 * It can be overridden in the subclasses.
	 * @return -1
	 */
	public double getArea()
	{
		return -1;
	}
	
	/**
	 * As a default, since we don't know the Graphics class, but we know that
	 * Java has it, set it to null. It can be overridden in the subclasses.
	 * @param g
	 */
	public void paint(Graphics g)
	{
		
	}
	
	/**
	 * Precondition: There are values.
	 * 
	 * Postcondition: Returns the value in x.
	 * @return
	 */
	public int getX() 
	{
		return x;
	}

	/**
	 * Precondition: There are values.
	 * 
	 * Postcondition: Sets a value in x.
	 * @param x
	 */
	public void setX(int x) 
	{
		this.x = x;
	}

	/**
	 * Precondition: There are values.
	 * 
	 * Postcondition: Returns the value in y.
	 * @return y 
	 */
	public int getY() 
	{
		return y;
	}

	/**
	 * Precondition: There are values.
	 * 
	 * Postcondition: Sets a value in x.
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}
}
