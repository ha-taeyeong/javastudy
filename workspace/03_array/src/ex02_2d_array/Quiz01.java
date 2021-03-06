package ex02_2d_array;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 5층 2호
		int[][] apt = {
				{ 1, 2 },
				{ 5, 2 },
				{ 3, 3 },
				{ 1, 4 },
				{ 5, 2 },
		};
		
		// 2개의 합계 변수가 필요합니다.
		int floor = 0; // 각 층마다 사는 사람들의 합계
		int total = 0; // apt 전체에 사는 사람들의 합계
		/*
		for (int i = 0; i < apt.length; i++) { // i는 층수
			floor = 0;
			for (int j = 0; j < apt[i].length; j++) { // j는 호수
				floor += apt[i][j];
				total = floor * i;
			}
			System.out.println((i+1) + "층에 " + floor + "명이 삽니다.");
		}
		System.out.println("apt에" + total + "명이 삽니다.");
		*/
		
		for(int i=0; i < apt.length; i++) {  // i는 층을 의미합니다.
			floor = 0;
			for( int j=0; j < apt[i].length; j++) {  // j는 호를 의미합니다.
				floor += apt[i][j];
			}
			System.out.println((i + 1) +"층에 "+ floor +"명이 삽니다.");
			total += floor;
		}
		System.out.println("apt에 " + total + "명이 삽니다.");
		
	}
}
