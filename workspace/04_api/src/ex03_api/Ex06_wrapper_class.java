package ex03_api;

public class Ex06_wrapper_class {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer("20");
		Integer c = 30; // AutoBoxing
		
		int total = a + b + c; // AutoUnBoxing
		System.out.println(total);
		
	}

}
