package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		//1.
		String a = "apple";
		String b = "apple";
		System.out.println(a == b); // 참조비교(주소비교)
		
		//2.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d);
		
		//3.
		System.out.println(a.length()); // a.length = 5
		
		//4.
		System.out.println(a.substring(0, 3)); // app (사용 인덱스 : 0, 1, 2)
		
		//5.
		String name = "      alice       ";
		System.out.println(name.trim().length()); // 양 옆의 공백을 공백을 보두 제거하고 alice만 남깁니다.
		
		//6.
		String str = "best of best of best";
		System.out.println("첫 번째 best의 인덱스: " + str.indexOf("best"));  // 처음부터 best를 검색합니다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", 4));  // 인덱스 4부터 best를 검색합니다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", str.indexOf("best"+1)));
		System.out.println("찾는 문자 (열)이 없으면 " + str.indexOf("v") + "이 나타납니다.");
		
		//7.
		System.out.println("마지막 best의 인덱스 : " + str.lastIndexOf("best"));
		
		//8.
		System.out.println(str.replace("b", "B"));
		System.out.println(str.replace("f", "")); // "f"를 지웁니다.
		
	}

}
