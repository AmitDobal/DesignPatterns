package design.factory;

public class WebDeveloper implements Employee {
	public int getSalary() {
		int salary = 50000;
		System.out.println("Getting webdeveloper salary: " + 50000);
		return salary;
	}
}
