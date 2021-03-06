package ex01_random;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int top = 10000;
		int bottom = 1;
		int rand = (int)(Math.random() * top) + bottom; // 난수 발생
		int n = 0; // 사용자 입력 값
		int times = 0; // 입력 횟수
		
		do {
			// 입력 받습니다.
			System.out.print("입력 >>> ");
			n = sc.nextInt();
			times++;
			// 입력 범위 체크
			if(n > top || n < bottom) {
				System.out.println(bottom + "~" + top + "범위를 입력하세요.");
				continue;
			}
			
			//비교합니다.
			if(n == rand) {
				System.out.println("총 " + times + "번만에 정답");
			}else if(n < rand) {
				System.out.println("Up");
				bottom = n + 1;
			}else {
				System.out.println("Down");
				top = n - 1;
			}
		}while(rand !=n);
		
	}

}
