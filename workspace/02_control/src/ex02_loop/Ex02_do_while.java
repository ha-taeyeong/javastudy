package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0;	// n값을 while문 조건과 맞지 않더라도 실행된다.
		
		do {	//어떠한 일이 있더라도 최초 1회 실행!!
			System.out.print("양수만 입력 >>> ");
			n = sc.nextInt();
			total += n;
		} while (n >= 0);
		
		total -= n;
		System.out.println("합계: " + total);
		
		sc.close();

	}

}

//do - while 문
		// 1. while문입니다.
		// 2. 반드시 한 번은 실행하는 while문입니다.