package design.abstractfactory;

public class WebDeveloper implements Employee {
	public int getSalary() {
		int salary = 50000;
		System.out.println("Getting webdeveloper salary: " + 50000);
		return salary;
	}

	@Override
	public String getName() {
		System.out.println("I am Web Developer");
		return "Web Developer";
	}
}
