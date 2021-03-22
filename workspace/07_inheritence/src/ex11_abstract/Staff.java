package ex11_abstract;

public abstract class Staff { // abstract public 도 가능합니다.

	//field
	private String name;

	//constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method
	public void info() {
		System.out.println("직원명 : " + name);
	}
	/*
	 public int getPay() {
	 	return ??;	// 반환할 수 있는 값은 없습니다.
	 }
	 */
	// 본문이 없는 getPay() 메소드를 만들면 됩니다.
	public abstract int getPay(); 
}
