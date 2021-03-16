package ex01_branch;



/* 2. 나이를 입력 받아서 구분 출력
7이하 : "미취학아동"
13 이하 : "초등학생"
16 이하 : "중학생"
19 이하 : "고등학생"
20 이상 : "성인"
나이 범위 (1~100)를 벗어나면 : "불가능한 나이"
*/
import java.util.Scanner;
public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		//범위 지정을 먼저 해준다.
		if (age < 1 || age > 100) {
			System.out.println(age +"살은 불가능한 나이입니다.");
		} else if(age<=7) {
			System.out.println(age +"살은 미취학 아동입니다.");
		} else if(age<=13) {
			System.out.println(age +"살은 초등학생입니다.");
		} else if(age<=16) {
			System.out.println(age +"살은 중학생입니다.");
		} else if(age<=19) {
			System.out.println(age +"살은 고등학생입니다.");
		} else {
			System.out.println(age +"살은 성인입니다.");
		}

	}

}

