package ex03_input;



//3. 나이를 입력 받아서 "성인", "미성년자" 구분 출력하기
import java.util.Scanner;
public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력 >>> ");
		int age = sc.nextInt();
		
		System.out.println(age >= 20 ? "성인" : "미성년자");
		
		sc.close();
		
	}

}

