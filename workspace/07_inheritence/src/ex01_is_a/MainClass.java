package ex01_is_a;

// Student가 eat()을 사용하고자 합니다.

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();

	}

}
