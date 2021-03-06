package ex01_array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리"};
		int[] scores = new int[students.length];
		
		// 점수를 입력 받습니다.
		for (int i = 0; i < scores.length; i++) {
			System.out.print(students[i] + "의 점수를 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		// 평균(합계/개수), 최소, 최대값을 저장할 변수를 선언하고, 초기화를 진행합니다.
		// 첫 번째 학생의 점수를 초기화 값으로 사용합니다.
		int total = scores[0];
		int min = scores[0];
		int max = scores[0];
		String top = students[0];
		String bottom = students[0];
		
		// 첫 번째 학생의 점수는 제외하고 합계, 최소, 최대값을 구합니다.
		// 인덱스를 1부터 사용합니다.(인덱스 0은 초기화에서 비교하기 때문이다.)
		for (int i = 1; i < scores.length; i++) {
			total += scores[i];
			if(min > scores[i]) { // 현재 저장된 최솟값보다 작은 점수가 나타난다면,
				min = scores[i]; // 그 작은 점수를 최솟값으로 사용합니다.
				bottom = students[i];  
			}
			if(max < scores[i]) { // 현재 저자된 최댓값보다 큰 점수가 나타나다면,
				max = scores[i]; // 그 큰 점수를 최댓값으로 사용합니다.
				top = students[i];
			}	
		}
		
		// 결과를 출력합니다.
		System.out.println("평균 점수는 " + (double)total/students.length + "점이다.");
		System.out.println("최소 점수는 " + min + "점이다.(" + bottom + ")");
		System.out.println("최대 점수는 " + max + "점이다.(" + top + ")");
		
		sc.close();
	}
}
