package ex12_abstract;

public class Circle extends Shape {

	//field
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//method
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
