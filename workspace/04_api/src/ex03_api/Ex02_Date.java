package ex03_api;

import java.util.Date;

public class Ex02_Date {
	
	public static void main(String[] args) {
		// java.util.Date
		// DB에서 Number-int,double, Varchar2-String, Date-Date Class 사용
		// Date를 좀 더 자세히 알고자 하면 timestamp를 사용
		// 1. 자바 내에서 사용하는 날짜/시간 처리 클래스입니다.
		// 2. 많은 메소드가 deprecate(소멸된다.) 되었기 때문에 사용하지 않아도 좋습니다.
		Date today = new Date();
		System.out.println(today);
	}

}
