package design.builderpattern;

public class Person {
	private final String name;
	private final int age;

	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	static class PersonBuilder {
		private String name;
		private int age;

		private PersonBuilder() {

		}

		public static PersonBuilder getBuilder() {
			return new PersonBuilder();
		}

		public PersonBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

}
