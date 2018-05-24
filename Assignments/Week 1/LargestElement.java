//Joseph Looney
//Date 5/15/2018
//Assignment 2 

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int length = 100;
		double[] values = new double[length];
		int currentSize = 0;
		
		System.out.println("Please enter values, Q to quit: ");
		while (in.hasNextDouble() && currentSize < values.length) {
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		
		double largest = values[0];
		for (int i = 1; i < currentSize; i++) {
			if (values[i] > largest) {
				largest = values[i]; 
			}
		}
	
		for (int i = 0; i < currentSize; i++) {
			System.out.print(values[i]);
			if (values[i] == largest) {
				System.out.println(" <=== largest value!");
			}
			System.out.println(" ");
		}
	}
}


//System.out.println(str.endsWith("e"));