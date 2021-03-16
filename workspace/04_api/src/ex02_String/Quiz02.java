package ex02_String;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>> ");
		String input = sc.next();
		
		if(input.indexOf(".") == -1) {
			System.out.println("정수입니다.");
		}else {
			System.out.println("실수입니다.");
		}

	}

}
