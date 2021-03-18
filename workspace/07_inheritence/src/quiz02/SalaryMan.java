package quiz02;

public class SalaryMan extends Staff {

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	// method
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		super.info(); // Staff의 info() -> name 출력
		System.out.println("기본금 : " + salary);
	}
}
