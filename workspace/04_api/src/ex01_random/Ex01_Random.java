package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		// java.util.Random
		Random random = new Random();
		
		// 1. int 난수
		//random.nextInt( )의 난수 범위
		//int 범위 중 하나
		//random.nextint(10)의 난수 범위
		//10개 중 하나 (0~9)	
		int rand1 = random.nextInt();
		int rand2 = random.nextInt(10);
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		// 2. double 난수
		//숫자를 맞추려는 목적이 아니다.
		//확률처리용으로 쓰기 위해 소수점 난수를 쓴다.
		//random.nextDouble( )의 난수 범위
		//[ 0<= 난수 < 1 ] 백분율 바꾸면 [ 0% <= 난수 < 100% ]
		double rand3 = random.nextDouble();
		System.out.println(rand3);
	}

}
