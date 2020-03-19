package ShapeInheritance;

import java.util.*;
import javax.swing.*;
import java.awt.*;

/*
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel).
 * This is the class that will display all the Shapes that you 
 * created in the subclasses and display it all in a JFrame.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B 
 * Assignment: Shape Inheritance
 */
public class PolyDemo extends JFrame 
{
	
	/**
	 * Constructor for PolyDemo. This will set up the JFrame
	 */
	public PolyDemo() 
	{

		//just some windowing stuff that must happen for all Frames
		getContentPane().add(new PolyDemoPanel());
		//Set the size
		setSize(1000, 1000);
		//Make it appear
		setVisible(true);
		//Exit when the user clicks exit button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String args[] )
	{
		PolyDemo myApp = new PolyDemo();
	}
	
	
	/**
	 * this is our first "inner" or internal class 
	 * the purpose of this class is solely to support the 
	 * JFrame class above, and I don't want it reused in arbitrary
	 * contexts, so by nesting this class here. I can indicate the 
	 * intent a bit more clearly that this class "goes with" the class
	 * above it. In general, each class is a separate entity that 
	 * should be contained in a separate file
	 */
	public class PolyDemoPanel extends JPanel 
	{		
		//Make an array of myShapes and the amount of shapes that can be 
		//stored is 20.
		Shape[] myShapes= new Shape[20];
		
		public PolyDemoPanel() 
		{
//			Shape a = new Shape(getRandInt(), getRandInt());
//			Shape b = new Circle(getRandInt(), getRandInt());
//			a = new Square(getRandInt(), getRandInt());
//			a = getRandShape();
//			((Circle) b).getRadius();
		
		
			/*
			* Code for populating our myShapes changes minimally when new
			* classes are introduced (only in getRandShape()).
		    */
			for( int i = 0; i < 20; i++ ) 
			{
				myShapes[i] =  getRandShape();
			}
		}
		
		/*
		 * Code for drawing our shapes doesn't change at all! Since we intended
		 * to take advantage of polymorphism, we coded this "in general" with
		 * respect to the superclass, and not specific to any subclass.
		 */
		public void paint(Graphics g) 
		{
			//don't remove - required for GUI widgets to draw correctly
			super.paint(g);
			
			//Late Binding here
			for( int i = 0; i < myShapes.length; i++ )
			{
				//This for loop is for the switch statement at the very bottom.
				//This demonstrates polymorphism because each time it goes 
				//through the index, it will go through each case statement
				//that corresponds with the index. And inside the cases, it 
				//calls the class and their draw method. (They are overridden).
				
				//This is the Shape method
				myShapes[i].paint(g);	
			}	
		}
			
		/**
		 * Precondition: Values are set for you.
		 * 
		 * Postcondition: Returns a random value from 0 to 200.
		 * 
		 * @return random number
		 */
		public int getRandInt() 
		{
			return ((int)(Math.random() * 200));	
		}
		
		/**
		 * Precondition: There is values that go into this method.
		 * 
		 * Postcondition: It should draw the figure that you created
		 * and display it in the JFrame.
		 * 
		 * @return retVal
		 */
		public Shape getRandShape()
		{
			//Set the Shape object to null
			Shape retVal = null;
			
			//Randomly assign values to x and y and not change them.
			final int x = getRandInt();
			final int y = getRandInt();
			
			/*
			 * Polymorphic extensibility demo
			 */
			
			//The for loop will iterate and each time it iterates, the cases
			//are for the index. So at index 1, it will call the paint method 
			//for square, index 2 will call paint for circle, and etc.
			switch((int) (Math.random() * 5)) 
			{
				case 0: 	
					//Makes retVal a new Object of Circle and draws it
					retVal = new Circle(x, y);
					break;
				case 1: 	
					//Makes retVal a new Object of Square and draws it
					retVal = new Square(x, y);
					break;
				case 2: 
					//Makes retVal a new Object of Circle and draws it
					retVal = new Star(x, y);
					break;
				case 3: 	
					//Makes retVal a new Object of Symbol and draws it
					retVal = new Symbol(x, y);
					break;	
				case 4: 	
					//Makes retVal a new Object of Symbol and draws it
					retVal = new Violin(x, y);
					break;
			}
			return retVal;
		}
	}	
	
}












