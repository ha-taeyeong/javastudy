package ex06_override;

public class Espresso extends Coffee{
	
	//field
	private int water;

	//constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	//method
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만 맛은 약간 씁니다.");
		
	}


	
}
