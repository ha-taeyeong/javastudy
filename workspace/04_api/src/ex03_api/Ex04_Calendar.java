package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {
		// java.util.Calendar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스입니다.
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다.
		// Calendar.MONTH : 0~11
		// Calendar.HOUR : 0~11
		// HOUR_OF_DAY : 0~23
		// ampm : 0(오전), 1(오후)
		// Calendar.DAY_OF_WEEK : 요일번호 (일:1, 월:2, ..., 토:7)
		
		Calendar date =Calendar.getInstance();
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK);
		String[] weekNames = { " ", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(year + "-" + month + "-" + day + " " + weekNames[weekNo] + "요일");
		
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR);
		int hour2 = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		System.out.println((ampm == 0 ? "오전" : "오후") + " " + hour + ":" + minute + ":" + second + "." + millis);
		
		//날짜 변경하기
		date.set(1990, 10, 10, 9, 30, 40); // 날짜 : 1990년 11월 10일 9시 30분 40초
		System.out.println(date);
		
		//Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
		
		//Calendar -> java.sql.Date
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		//java.sql.Date -> Calendar
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
	}
}
