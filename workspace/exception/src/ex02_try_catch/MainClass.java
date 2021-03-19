package ex02_try_catch;

public class MainClass {

	public static void main(String[] args) {
		
		int a = 0;
		
		try {
			//System.out.println(2 / 0); // 예외가 발생하면 try문이 곧바로 종료됩니다.
			Integer.parseInt("1.5");
			a = 10;
		} catch (ArithmeticException e) {// import가 필요할 수 있으니 자동완성추가해야됨
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("예외가 발생했습니다.2");
		}
		System.out.println(a);	
	
	
	try {
		//String name = null;
		//name.equals("james");
		int[] b = new int[3];
		b[10] = 10;
	} catch (Exception e) { // Exception은 모든 예외클래스들의 "슈퍼클래스"입니다.
		System.out.println("예외가 발생했습니다.");
	}
	
	}

}
