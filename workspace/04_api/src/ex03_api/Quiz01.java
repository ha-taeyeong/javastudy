package ex03_api;

public class Quiz01 {

	public static void main(String[] args) {
		
		String str = "";
		long start1 = System.nanoTime();
		for(int n = 1; n <=100000; n++) {
			str += n; //+는 연결연산자
		}
		long end1 = System.nanoTime();
		System.out.println("String 경과시간: " + (end1-start1) + "ns"); 
		System.out.println("String 경과시간: " + ((end1-start1) / 1000000000.0) + "초");
		
		StringBuilder sb = new StringBuilder();
		long start2 = System.nanoTime();
		for(int n = 1; n <=100000; n++) {
			sb.append(n);
		}
		long end2 = System.nanoTime();
		System.out.println("String 경과시간: " + (end2-start2) + "ns"); 
		System.out.println("String 경과시간: " + ((end2-start2) / 1000000000.0) + "초");
	}

}
