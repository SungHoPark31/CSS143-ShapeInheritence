package ShapeInheritance;

import java.awt.*;

/**
 * This class was taken from the lab. It's purpose is to draw
 * a Square in the Jframe.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 *
 */
public class Square extends Shape
{
	//We make these private
	private double base;
	private double height;
	
	/**
	 * Precondition: There are values in x and y
	 * 
	 * Postcondition: Goes to the Super class and sets x and y to that 
	 * super class. x and y are random numbers generated in the PolyDemo
	 * @param x
	 * @param y
	 */
	public Square(int x, int y) 
	{
		super(x, y);
	}
	

	@Override
	/**
	 * Precondition: There is a value in base and height.
	 * 
	 * Postcondition: Returns the area of the square presented in the 
	 * screen.
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
	 * is painted as well).
	 */
	public void paint(Graphics g)
	{
		//This will set the color to green
		g.setColor(Color.GREEN);
		

		//Create the rectangular shape using the position and the width and 
		//height
		g.drawRect(600, 50, 200, 200);
		
		//Fills the inside shape to the color.
		g.fillRect(600, 50, 200, 200);
		
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
