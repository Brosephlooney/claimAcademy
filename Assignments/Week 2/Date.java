//Joseph Looney
// Date: 5/22/2018 
// Assignment Classes and Objects #2

public class Date {
	
	//Properties
	private int month;
	private int day;
	private int year;
	
	// Constructor
	public Date (int month, int day, int year)
	{
		this.month	= month;
		this.day	= day;
		this.year	= year;
	}
	//default
	public Date() {}

	
// ***** Generated the toString ***********************************************************************************

	@Override
	public String toString() 
	{
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

	
//****** Generated my getters and setters *************************************************************************
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}		
	
//********************************************************************************************************************	
	
}



/*
Create a class called Date that includes three pieces of information as instance variables 1. Month (type int) 2. Day (type int) 3. Year (type int). 

Your class should have the following methods: - 
A. Constructor that initializes the three instance variables and assumes that the values provided are correct. 

B. Provide a method displayDate() that displays the month, day and year separated by forward slashes (/).
*/