package design.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		Employee emp2 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		
		emp1.getName();
		emp2.getName();
		
	}
}
