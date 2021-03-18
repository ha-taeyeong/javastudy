package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {
		
		// 컴파일 -> 실행
		// 코드    -> new 처리
		
		Person p1;
		p1 = new Student();
		p1.eat();
		p1.sleep();
		((Student)p1).study();
		
		Person p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();
		
		//실수를 해 봅시다
		Person p3 = new Student();
		p3.eat();
		p3.sleep();
		//((Worker)p3).work(); // ClassCastException 발생
		
		if( p3 instanceof Student ) {
			((Student)p3).study();
		} else if ( p3 instanceof Worker ) {
			((Worker)p3).work();
		}
		
	}

}
