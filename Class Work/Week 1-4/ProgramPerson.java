
public class ProgramPerson {

	public static void main(String[] args) {
		StudentPerson s1 = new StudentPerson();
		EmployeePerson e1 = new EmployeePerson();
		
		double taxes=s1.taxes(120.5);
		System.out.println(taxes);
		

	}

}
