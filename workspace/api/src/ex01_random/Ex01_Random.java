package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 1	
		int rand1 = random.nextInt();
		int rand2 = random.nextInt(10);
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		// 2
		double rand3 = random.nextDouble();
		System.out.println(rand3);
	}

}
