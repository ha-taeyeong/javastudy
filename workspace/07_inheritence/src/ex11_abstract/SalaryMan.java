package ex11_abstract;

public class SalaryMan extends Staff{

	//field
	private int salary;

	//constructor
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	//method
	@Override
	public void info() {
		super.info();
		System.out.println("기본급 : " + salary);
	}
	// getPay()는 필수입니다.
	@Override
	public int getPay() {
		return salary;
	}
	
}
