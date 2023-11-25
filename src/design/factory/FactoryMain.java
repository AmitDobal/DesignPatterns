package design.factory;

public class FactoryMain {
	public static void main(String[] args) {
		Employee emp = EmployeeFactory.getEmployee(EmployeeConstants.ANDROID_DEVELOPER_EMPLOYEE);
		emp.getSalary();
	}
}
