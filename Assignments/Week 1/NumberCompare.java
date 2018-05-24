//Joseph Looney
//Date 5/17/2018
//Assignment 4 Methods 

import java.util.Scanner;

public class NumberCompare {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number for value a");
		int a = in.nextInt();
		System.out.println("Now enter a value for b");
		int b = in.nextInt();
		System.out.println("Lastly, enter a value for c");
		int c = in.nextInt();
		
		System.out.println("The value of the 3: " + Value(a,b,c)); // need to include the values associated with it value(A,b,c)
		
	}
	public static int Value(int a, int b, int c) //a b c are being passed from the main to give it the information needed. It is then returned to the main 
	{
		if(a == b && a == c)
			return 0;
		else if(a == b || a == c || b == c)
			return 20;
		else
			return 10;
	}
}
