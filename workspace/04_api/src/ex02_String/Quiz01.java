package ex02_String;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.print("시간 >>> "); hour = sc.nextInt();
		System.out.print("분 >>> "); minute = sc.nextInt();
		System.out.print("초 >>> "); second = sc.nextInt();
		
		String strHour = hour + ""; // String.valueOf(hour);
		String strMinute = minute + "";
		String strSecond = second + "";
		
		if(strMinute.length() == 1) { // if (minute < 10) {
			strMinute = "0" + strMinute;
		}
		if(strMinute.length() == 1) { // if (minute < 10) {
			strMinute = "0" + strSecond;
		}
		
		String time = strHour + ":" + strMinute + ":" + strSecond;
		System.out.println(time);
		
		sc.close();
	}

}
