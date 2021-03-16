package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println(p.isKorean() ? "한국인" : "외국인");
	}

}
