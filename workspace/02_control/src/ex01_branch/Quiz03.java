package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >>>");
		int age = sc.nextInt();
		
		switch (age / 10) {
		case 0: // age = 1 ~ 9
		case 1: // age = 10 ~ 19
			System.out.println("미성년자");
			break;
		default:
			System.out.println("성인");
		}
		
		sc.close();

	}

}


/*
int state = 0; // 미성년자를 의미
if (age >= 20) {
	state = 1; // 성인을 의미
}

switch (state) {
case 0:
	System.out.println("미성년자");
	break;
case 1:
	System.out.println("성인");
	break;
}
*/
