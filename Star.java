package ShapeInheritance;

import java.awt.*;

/**
 * This class was taken from the lab. It's purpose is to draw
 * a Star in the Jframe.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 *
 */
public class Star extends Shape
{
	private double base;
	private double height;
	private double side;

	/**
	 * Precondition: There are values in x and y
	 * 
	 * Postcondition: Goes to the Super class and sets x and y to that 
	 * super class. x and y are random numbers generated in the PolyDemo
	 * 
	 * @param x
	 * @param y
	 */
	public Star(int x, int y) 
	{
		super(x, y);
	}
	
	@Override
	/**
	 * Precondition: There is a value in base and height and side.
	 * 
	 * Postcondition: Returns the area of the pentagon plus 5 triangles for the
	 * star.
	 */
	public double getArea()
	{
		double pentagonArea = ((1/4) * ((Math.sqrt((5 * (5 + (2 * 
									(Math.sqrt(5))))))) * Math.pow(side, 2)));
		double triangleAreaTimes5 = (((base * height)/2) * 5);
		
		return pentagonArea  + triangleAreaTimes5;
	}
	
	@Override
	/**
	 * Precondition: There Graphics g is not null
	 * 
	 * Postcondition: Creates and paints the shape (and the color if color
	 * is painted as well). This will make a star.
	 */
	public void paint(Graphics g)
	{
		//Type cast to Graphics 2D
		Graphics2D g2d = (Graphics2D) g;
		
		/*
		 * Basic rundown on drawing/filling polygons 
		 * 
		 * fillPolygon(int[] xPositions, int[] yPositions,
		 * 										 howManyPointsThereAre);
		 */
		
		//Red colors
		
		//Left side of star
		g2d.setColor(Color.RED);
		int[] xr1 = {590, 550, 400};
		int[] yr1 = {590, 540, 550};
		g2d.fillPolygon(xr1, yr1, 3);
		
		//Top of the star
		int[] xr2 = {590, 630, 590};
		int[] yr2 = {590, 540, 400};
		g2d.fillPolygon(xr2, yr2, 3);
		
		//Right side of the star
		int[] xr3 = {590, 630, 780};
		int[] yr3 = {590, 540, 550};
		g2d.fillPolygon(xr3, yr3, 3);
		
		//Bottom Right side of the star
		int[] xr4 = {590, 645, 700};
		int[] yr4 = {590, 615, 740};
		g2d.fillPolygon(xr4, yr4, 3);
		
		//Bottom Left side of the star
		int[] xr5 = {590, 590, 480};
		int[] yr5 = {590, 650, 740};
		g2d.fillPolygon(xr5, yr5, 3);
		
		//Orange colors
		
		
		//Left side of the star
		g.setColor(new Color(255, 130, 0));
		
		int[] xo1 = {590, 535, 400};
		int[] yo1 = {590, 615, 550};
		g2d.fillPolygon(xo1, yo1, 3);
		
		//Top of the star
		int[] xo2 = {590, 550, 590};
		int[] yo2 = {590, 540, 400};
		g2d.fillPolygon(xo2, yo2, 3);
	
		//Right side of the star
		int[] xo3 = {590, 645, 780};
		int[] yo3 = {590, 615, 550};
		g2d.fillPolygon(xo3, yo3, 3);
		
		//Bottom Right side of the star
		int[] xo4 = {590, 590, 700};
		int[] yo4 = {590, 650, 740};
		g2d.fillPolygon(xo4, yo4, 3);
		
		//Bottom Left side of the star
		int[] xo5 = {590, 535, 480};
		int[] yo5 = {590, 615, 740};
		g2d.fillPolygon(xo5, yo5, 3);
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
	 * 
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

	/**
	 * Precondition: There is a side.
	 * 
	 * Postcondition: Returns the side.
	 * 
	 * @return
	 */
	public double getSide() 
	{
		return side;
	}

	/**
	 * Precondition: There is a side.
	 * 
	 * Postcondition: Sets a value in the side
	 * 
	 * @param side
	 */
	public void setSide(double side) 
	{
		this.side = side;
	}
	
	
}
