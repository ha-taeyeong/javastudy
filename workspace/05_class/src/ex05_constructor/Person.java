package ex05_constructor;

public class Person {
	
		// field
		String name;
		int age;
		char gender;
		
		// constructor
		Person(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		Person(String name) {
			this(name, 0, '\0');
		}
		Person(String name, int age) {
			this(name, age, '\0');
		}
		Person() {
			this(null, 0, '\0');
		}
}
