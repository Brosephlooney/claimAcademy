//Joseph Looney
// Date: 5/22/2018 
// Assignment Classes and Objects #2

import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
		
		//setting up the scanner and creating a date object so that I can pull methods from the date class. 
		Scanner input = new Scanner(System.in);
		Date date1 = new Date();
		
		
		//gathering users input
		System.out.println("Please enter what number month it is. (I.e. September = 9)");
		date1.setMonth(input.nextInt());
		System.out.println("Please enter todays date. (i.e. 5, 8, 23)");
		date1.setDay(input.nextInt());
		System.out.println("Please enter the current year. (i.e. 2012)");
		date1.setYear(input.nextInt());
		
		// We have to use the getters because the properties are private to the date class.
		System.out.println("Today's date is: " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());

	}
}


/*
Create a class called Date that includes three pieces of information as instance variables 1. Month (type int) 2. Day (type int) 3. Year (type int). 

Your class should have the following methods: - 
A. Constructor that initializes the three instance variables and assumes that the values provided are correct. 

B. Provide a method displayDate() that displays the month, day and year separated by forward slashes (/).
*/