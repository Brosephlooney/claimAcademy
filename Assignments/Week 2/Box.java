//Joseph Looney
// Date: 5/22/2018 
// Assignment Classes and Objects #1

public class Box {

// Properties/fields of the box	

	private double matCost;
	private double height;
	private double length;
	private double depth;
	
	
//Constructors
	
	public Box (double matCost, double height, double length, double depth) 
	{
		this.matCost 	= matCost;
		this.height 	= height;
		this.length 	= length;
		this.depth		= depth;	

		
	}
	
	// The default variable
	public Box() {}
	
	
// ***** Generated the toString ***********************************************************************************
	
	@Override
	public String toString() 
	{
		return "Box [matCost=" + matCost + ", height=" + height + ", length=" + length + ", depth=" + depth + "]";
	}
		
	
//****** Generated my getters and setters *************************************************************************


	public double getMatCost() 
	{
		return matCost;
	}


	public void setMatCost(double matCost) 
	{
		this.matCost = matCost;
	}


	public double getHeight() 
	{
		return height;
	}


	public void setHeight(double height) 
	{
		this.height = height;
	}


	public double getLength() 
	{
		return length;
	}


	public void setLength(double length) 
	{
		this.length = length;
	}


	public double getDepth() 
	{
		return depth;
	}


	public void setDepth(double depth) 
	{
		this.depth = depth;
	}
	
// ********************************************************************************************************************
		//Methods for calculating the "volume", "Surface area", and "cost".
		
	double volume() 
	{
		return height * length * depth;
	}
	
	
	double SurfaceArea()
	{
		return 2 * length * height + 2 * length * depth +2 * depth * height;
	}
	// our measurements didn't match up with the formula had to improvise. SA=2lw+2lh+2hw
	// depth = height height= width length = length 
	
	double cost()
	{
		return length * height * matCost;
	}
}



/* 

		The assignment
1.Write a "Box" class which has following properties:
cost of material per square inch, 
height in inches, 
length in inches, 
depth in inches. 

2. Provide methods for calculating the "Volume", "SurfaceArea" and "Cost". 

Write a program to use the class by creating a Box object and asking the user for each of the properties, 
setting these properties for the box and printing out the Volume, Surface Area and Cost of the box.
*/


