package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue문
		// 1. loop문으로 되돌아가서 다시 실행합니다.
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용합니다.
		/*
		int n = 1;
		while (n <= 10) {
			if(n % 2 == 1) { // 홀수는 출력합니다.
				System.out.println(n);
			}
			n++;
		}
		*/
		/*
		int n = 1;
		while (n <= 10) {
			if(n % 2 == 0) { // 짝수는 while문으로 돌려보냅니다.
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		*/
		/*
		for(int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				continue;
			}
			System.out.println(n);
		}
		*/
		// 소원을 3개 들어줍니다.
		// 안 되는 소원은 "로또당첨"입니다. 나머지 소원은 모두 들어줍니다.
		
		
		/*
		for(int n=0; n<3; n++) {
			System.out.print("소원을 입력하세요>> ");
			String hope = sc.next();
			if(!hope.equals("로또당첨")) {
				System.out.println("소원이 이루어졌습니다.");
			}else {
				System.out.println("소원을 이룰수없습니다.");
			}
			
		}
		*/
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String wishList = "";
		while (count < 3) {
			System.out.print("소원 입력 >>> ");
			String wish = sc.next();
			if(wish.equals("로또당첨")) {
				continue;
			}
			wishList += wish;
			count++;
		}
		System.out.println(wishList);
		
		sc.close();
		

	}

}
