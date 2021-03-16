package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		// java.sql.Date(DB와 호환)
		// DB의 Date타입이 맞게끔 wrapping 처리한 클래스입니다.
		// Date today = new Date(date);
		// new Date는 사용할 일이 없다.
		// date 값을 DB에서 입력하기 때문이다.
		long date = System.currentTimeMillis();
		Date today = new Date(date);
		
		System.out.println(today);

	}

}
