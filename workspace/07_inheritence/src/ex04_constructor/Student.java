package ex04_constructor;

// 서브클래스 (자식클래스)
public class Student extends Person {

	//field
	private String school;
	
	//constructor
	public Student(String name, String school) {
		super(name);
		this.school = school;
	}
	
	// method
	public void info() {
		System.out.println("이름 : " + getName());
		System.out.println("학교 : " + school);
	}

	
}
