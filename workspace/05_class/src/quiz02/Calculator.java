package quiz02;

public class Calculator {
	//반환 값이 없는 경우
	void addtion(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	//반환 값이 있는 경우
	int subraction(int a, int b) { // int a, int b = 매개변수(저장)
		return (a >= b) ? a - b : b - a;
	}

}
