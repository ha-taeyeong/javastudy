package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {
		
		// break문
		// 1. switch문을 종료합니다.
		// 2. loop문을 종료합니다.
		
		// 주요 사용
		// 무한루프 + break문
		
		// 무한루프
		// 1. while (true) { }
		// 2. for ( ; ; ) { }
		/*
		Scanner sc = new Scanner(System.in);
		
		String city = null;
		
		while (true) {
			
			System.out.print("수도는? >>> ");
			city = sc.next();
			
			if( city.equals("서울") || city.equalsIgnoreCase("seoul")) { // 맞히면 그만합니다.
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
			
		}
		*/
		// 
		
		int total=0;
		int n = 1;
		while(true) {
			total += n;
			if (total > 3000) {
				break;
			}
			n++;
		}
		
		System.out.println("1부터 " + n + "까지 합계는 " + total + "입니다.");
		
		
//		sc.close();

	}

}


