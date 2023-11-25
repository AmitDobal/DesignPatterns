package design.abstractfactory;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		int salary = 50000;
		System.out.println("Getting Android Developer salary: " + 50000);
		return salary;
	}

	@Override
	public String getName() {
		System.out.println("I am Android Developer");
		return "Android Developer";
	}

}
