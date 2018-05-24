//Joseph Looney
//Date 5/17/2018
//Assignment 4 Methods 

import java.util.Scanner;

public class SquirrelsPlay {

	public static void main(String[] args) 
	{
		// this program will determine whether or not the squirrels will play.
		// the squirrels will play in weather between 60-100 during summer and 60-90 during the rest of the year.
		Scanner in = new Scanner(System.in);
		System.out.println("What is the current weather in degrees fehrenheit?");
		int temp = in.nextInt();
		// now that we have the degrees we need to determine if it is summer.
		System.out.println("Is it currently summer? Answer with true/false");
		Scanner em = new Scanner (System.in);
		boolean isSummer = em.nextBoolean(); // Declaration of isSummer as a boolean 
		in.close();
		em.close();
		
		System.out.println("The squirrels play outside: " + squirrel(temp, isSummer));
				
	}
	// this function tests whether or not the squirrels play outside based on the users input. 
	public static boolean squirrel(int temp, boolean isSummer)  
	{
		if(temp >= 60 && temp <= 100 && isSummer == true) {
			return true;
		}
		else if(temp >= 60 && temp <= 90 && isSummer == false) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
