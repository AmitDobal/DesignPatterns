package design.abstractfactory;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}
	
}
