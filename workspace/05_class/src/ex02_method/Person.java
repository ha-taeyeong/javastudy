package ex02_method;

public class Person {
	
	//field
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height;
	double weight;
	
	//method
	// 1. 결과타입 : 결과값이 없다.(void)
	// 2. 메소드명 : set
	// 3. 매개변수 : String n, int a, char g, boolean isK
	// 4. 역할 : 전달되는 인수를 필드에 전달합니다.
	void set(String n, int a, char g, boolean isK, double h, double w) {// (매개변수)
		name = n;
		age = a;
		gender = g;
		isKorean = isK;
		height = h;
		weight = w;
		
	}
	
	//1. 결과타입 : 결과값이 없다. (void)
	//2. 메소드명 : info
	//3. 매개변수 : 전달되는 인수가 없다.
	//4. 역할 : 객체의 필드값을 출력해줍니다.
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + gender);
		System.out.println(isKorean ? "한국인" : "외국인");
	}
	
	//1. 결과타입 : 결과값의 타입이 double입니다.
	//2. 메소드명 : getBMI
	//3. 매개변수 : 전달되는 인수가 없다.
	//4. 역할 : 객체의 체질량지수(BMI)값을 결과로 반환합니다.
	double getBMI() {
		// bmi = 몸무게 / 키(m) 제곱
		double bmi = weight / Math.pow(height / 100, 2);
		return bmi;
		
	}
}
