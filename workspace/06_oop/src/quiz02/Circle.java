package quiz02;

public class Circle {

	//field
	private Coord center;
	private double radius;
	
	//constructor
	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		this(new Coord(x, y), radius);
		
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	void info() {
		System.out.print("중심좌표");
		System.out.println("반지름" + radius + ", 넓이" + getArea());
	}
}
