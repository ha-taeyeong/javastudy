package ex01_random;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] gababo = { "가위", "바위", "보" };
		
		int win = 0; // 이긴횟수
		int draw = 0; // 비긴횟수
		
		loop:
		while(true) {
			System.out.print("가위바위보 >>> ");
			int player = 0; // 초기화로 가위
			switch(sc.next()) {
			case"바위":
				player = 1;
				break;
			case"보":
				player = 2;
			}
			System.out.print("Player는 " + gababo[player]);
			
			// player : 0, 1, 2
			// computer : 0, 1, 2
			// diff = player - computer
			// 1. 이긴 경우 : diff = -2, 1
			// 2. 비긴 경우  diff = 이 외의 값
			
			int computer = (int)(Math.random()*3); // gababo 배열의 인덱스
			System.out.print(", Computer는 " + gababo[computer]);
			
			switch(player - computer) {
			case -2: case 1:
				System.out.print(", 이겼습니다.");
				win++;
				break;
			case 0:
				System.out.print(", 비겼습니다.");
				draw++;
				break;
			default:
				System.out.print(", 졌습니다.");
				break loop;
			}
		}
		
		System.out.println(win + "승" + draw + "무");
		
		sc.close();
	}

}
