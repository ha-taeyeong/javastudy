package ex02_2d_array;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = { "스폰지밥", "타요", "브레드", "과목합계" };
		String[] subjects = { "국어", "영어", "수학", "학생합계" };
		int[][] scores = new int[names.length][subjects.length];
		for (int i = 0; i < names.length-1; i++) {
			for( int j = 0; j < subjects.length-1; j++) {
				System.out.print(names[i] + "의 " + subjects[j] + "의 점수 입력 >> ");
				scores[i][j] = sc.nextInt();
				// 각각의 점수 : scores[i][j]
				// 과목의 합계 : scores[names.length-1][j]
				// 학생의 합계 : scores[i][subjects.length-1]
				// 전체의 합계 : scores[names.length-1][subjects.length-1]	
				scores[names.length-1][j] += scores[i][j];
				scores[i][subjects.length-1] += scores[i][j];
				scores[names.length-1][subjects.length-1] += scores[i][j];
			}
		}
		
		System.out.println("\t");
		for (String subject : subjects) {
			System.out.print("\t" + subject);
		}
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
