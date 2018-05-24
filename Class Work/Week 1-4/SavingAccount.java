//Joseph Looney
//Date 5/23/2018
//Abstract Classes
//Claim Academy

public class SavingAccount extends Account {
	
//after extending to account the program pulls the public void annualinterest(). All that is left is adding the body.
	
	
	@Override
	public void annualInterest() {
		balance += (balance * 0.1); }

}
