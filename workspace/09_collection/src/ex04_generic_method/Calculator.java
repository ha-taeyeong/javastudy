package ex04_generic_method;

public class Calculator {
	
	// method
	public <T> double getTotal1(T[] a) {  //double을 사용해야 int와 double을 받을 수 있다.
		double total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += ((Number)a[i]).doubleValue(); //타입을 바꾼다.
		}
		return total;
	}
	
	public <T extends Number> double getTotal2(T[] a) { // T는 Number를 상속받는 클래스만 가능해진다.
		double total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += a[i].doubleValue();
		}
		return total;
	}
}
