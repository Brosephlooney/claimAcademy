//Joseph Looney
//Date 5/23/2018
//Abstract Classes
//Claim Academy

public class AccountProgram {

	// Cannot create objects of abstract classes
	
	public static void main(String[] args) {
		SavingAccount a1 = new SavingAccount();
		a1.balance = 100;
		a1.deposit(5000);
		a1.withdraw(2000);
		System.out.println(a1.balance);
		
		a1.annualInterest();
		System.out.println(a1.balance);
		

	}
}
