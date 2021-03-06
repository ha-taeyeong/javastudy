package ex06_access;

public class Person {
	
	// field
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// method
	// name에 접근할 수 있는 메소드
	// 1. name에 값을 전달하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// 2. name을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// age에 접근할 수 있는 메소드
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	//isKoran에 접근할 수 있는 메소드
	public void setKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}
	public boolean isKorean() {
		return isKorean;
	}
	
	
	
}
