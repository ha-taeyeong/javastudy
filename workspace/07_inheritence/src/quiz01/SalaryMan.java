package quiz01;

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
}
