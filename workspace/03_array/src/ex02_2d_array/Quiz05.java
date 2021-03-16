package ex02_2d_array;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] dict = {
				{ "봄", "spring" },
				{ "여름", "summer" },
				{ "가을", "fall" },
				{ "겨울", "winter" }
		};
		
		
		int wrong = 0; // 틀린 문제의 갯수
		
		
		for (int i = 0; i < dict.length; i++) {
			System.out.print(dict[i][0] + "을 영어로 하면? >>>");
			String answer = sc.next();
			if(answer.equalsIgnoreCase(dict[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
				wrong++;
			}
		}
		System.out.println((dict.length - wrong)+ "문제를 맞히고, "+ "틀린 갯수는 " + wrong + "입니다.");
	}

}
