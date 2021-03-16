package ex02_String;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		//1.문자열 생성
		StringBuilder sb = new StringBuilder("hello");

		//2.문자열 추가(핵심 메소드)-성능을 위해서
		sb.append(" ").append("java");
		
		System.out.println(sb);
		
		//3.문자열 비교
		//  StringBuilder는 비교 할 수 없습니다.
		//  String이 아니라서 비교 못합니다.
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		System.out.println(sb1.equals(sb2));
		
		//4.문자열로 변환해 봅시다.(자주 사용)
		//  문자열 변환 후 비교 가능합니다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
		
		
		

	}

}
