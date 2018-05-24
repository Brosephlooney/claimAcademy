//Joseph Looney
// Date: 5/22/2018 
// Assignment Classes and Objects #1

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Box box1 = new Box();
		Box box2 = new Box();
		
		System.out.println("Enter the value for Box 1's mat cost.");
		box1.setMatCost(input.nextDouble());
		
		System.out.println("Enter the value for Box 1's height in inches.");
		box1.setHeight(input.nextDouble());
		
		System.out.println("Enter the value for Box 1's length in inches.");
		box1.setLength(input.nextDouble());
		
		System.out.println("Enter the value for Box 1's depth in inches.");
		box1.setDepth(input.nextDouble());
		
		//System.out.println(box1);
		
		//Initializing and declaring the values for box1
		double volume1;
		volume1 = box1.volume();
		System.out.println("The volume for box 1 is: " + volume1);
		
		double sa1;
		sa1 = box1.SurfaceArea();
		System.out.println("The surface are for box 1 is " + sa1);
		
		double cost1;
		cost1= box1.cost();
		System.out.println("The cost of box 1 is: " + cost1);
	}
}



/*
Write a "Box" class which has following properties:
cost of material per square inch, 
height in inches, 
length in inches, 
depth in inches. 

Provide methods for calculating the "Volume", "SurfaceArea" and "Cost". 

Write a program to use the class by creating a Box object and asking the user for each of the properties, setting these properties for the box and printing out the Volume, Surface Area and Cost of the box.
*/
