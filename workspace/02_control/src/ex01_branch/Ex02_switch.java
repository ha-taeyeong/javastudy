package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
		int choice = 2;
		
		switch (choice) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		default: 
			System.out.println("1과 2가 아니다.");
			
		}
		
		
	}

}

// switch문을 종료합니다.
//if문의 else와 같은 의미
//break; 불필요합니다. 없어도 어차피 swich문은 끝납니다.
