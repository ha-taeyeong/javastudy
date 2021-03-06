package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학", "과학"};
		int[] scores = new int[subjects.length];
		String name = "james";
		int total = 0;
		double ave = 0;
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + " >>> ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		ave = total / subjects.length;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))) {
			dos.writeInt(subjects.length);
			dos.writeUTF(name);
			for (int score : scores) {
				dos.writeInt(score);
			}
			dos.writeDouble(ave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
