package design.factory;

public class EmployeeFactory {
	private static Employee employee;

	public static Employee getEmployee(Number type) {
		if (EmployeeConstants.ANDROID_DEVELOPER_EMPLOYEE.equals(type))
			employee = new AndroidDeveloper();
		else if (EmployeeConstants.WEB_DEVELOPER_EMPLOYEE.equals(type))
			employee = new WebDeveloper();

		return employee;
	}
}
