package ex01_branch;



//1. 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의배수" 출력
import java.util.Scanner;
public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 입력 >> ");
		int n = sc.nextInt();
		
		if(n%3 == 0) {
			System.out.println(n + "은(는) 3의 배수입니다.");	
		} if(n%2 == 0) {
			System.out.println(n + "은(는) 짝수입니다.");
		} else {
			System.out.println(n + "은(는) 홀수입니다.");
		}
		
		sc.close();

	}

}

//3의 배수를 먼저 하지 않으면 짝수나 홀수가 먼저 값을 가져간다.