//Joseph Looney
//Date 5/23/2018
//Abstract Classes
//Claim Academy

public abstract class Account {
	
// properties
	double balance;
	
// methods
	public void deposit(double a) {
		balance += a; }
	
	public void withdraw(double a) {
		balance -= a; }
	
	
	//abstract method 
	public abstract void annualInterest();
	
}
