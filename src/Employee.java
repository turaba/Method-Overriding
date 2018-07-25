
public class Employee {

	protected String empName;
	protected Double empSalary;
	public Employee(String name, Double salary) {
		super();
		empName = name;	
		empSalary = salary;
	}
	
	
	public void mailCheck() {
		
		System.out.println(empName + " will get " + empName + " TK salary of this month");
	}
	

}
