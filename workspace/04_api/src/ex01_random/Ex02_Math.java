package ex01_random;

public class Ex02_Math {

	public static void main(String[] args) {
		// java.lang.Math
		
		//Math.random의 난수 범위
		//0.0 <= Math.random( ) <1.0
		System.out.println(Math.random());
		
		// Math.random( )		0.0 <= random < 1.0
		// Math.random( ) * 3		0.1 <= random < 3.0
		// (int)(Math.random( ) * 3)	  0  <= random < 3(자주 사용)
		// (int)(Math.random( ) * 3) +1     1  <= random < 4(자주 사용)
		
		// (int)(Math.random( ) * 개수) + 시작값
		
		// Math.random( ) 의 결과가 0.1보다 작을 확률은 얼마일까요? 10%
		// Math.random( ) 의 결과가 0.2보다 작을 확률은 얼마일까요? 20%
		// Math.random( ) 의 결과가 0.a보다 작을 확률은 얼마일까요? a0%
		
		// 10% 확률로 "강화성공", 90% 확률로 "강화실패"
		if(Math.random() < 0.1) {
			System.out.println("강화성공");
		}else {
			System.out.println("강화실패");
		}
		
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println(lotto);
	}

}
