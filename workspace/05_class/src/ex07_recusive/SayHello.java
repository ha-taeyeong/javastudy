package ex07_recusive;

public class SayHello {
	
	public void say(int n) {
		if(n > 0) {
			System.out.println("Hello");
			say(n - 1); // 재귀적 호출
		}
	}

}
