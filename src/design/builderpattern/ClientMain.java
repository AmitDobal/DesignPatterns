package design.builderpattern;


public class ClientMain {
	public static void main(String[] args) {
		User u = new User.UserBuilder().setUserId("1").setEmail("Amit@gmail.com").setUserName("Amit Singh").build();
//		Person p = new Person.PersonBuilder().setAge(20).setName("Rahul").build();
		Person p1 = Person.PersonBuilder.getBuilder().setAge(30).setName("Ramesh").build();

		System.out.println(u);
//		System.out.println(p);
		System.out.println(p1);
	}
}
