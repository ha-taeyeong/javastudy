package ex03_api;

public class Ex01_System {

	public static void main(String[] args) {
		
		//1. 시스템 종료
//		System.exit(0);
		
		//2. 현재 시간(타임스탬프) 알아내기
		//timestamp : 1970-01-01 0:00:00 부터  현재까지 경과한 시간(단위 : 밀리초<1000/1초)
		//작업 소요시간을 알아낼 수 있다.
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		//3. 현재 시간 알아내기
		//자바가 마음대로 결정한 기준일로부터 경과한 시간(단위 : 나노초<10억/1초>)
		//작업 소요시간을 알아낼 수 있다.(좀 더 정밀한 시간을 알아내기 위해)
		long something = System.nanoTime();
		System.out.println(something);
		
		//4.배열 복사하기
		//a[0]에서 b[0]로 복사합니다.(시작점)
		//a.length만큼 복사 작업을 반복수행
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[10];
		
		System.arraycopy(a, 0, b, 1, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
