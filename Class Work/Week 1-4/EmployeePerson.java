
public class EmployeePerson implements Person {

	@Override
	public double taxes(double amount) {

		return (amount * .2);
	}

}
