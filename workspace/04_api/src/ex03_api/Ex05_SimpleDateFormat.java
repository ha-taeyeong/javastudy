package ex03_api;

import java.text.SimpleDateFormat;
import java.util.Date;

class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date date = new Date(System.currentTimeMillis());
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("non-pattern: " + date);
		System.out.println("pattern: " + sdf.format(date));

	}

}
