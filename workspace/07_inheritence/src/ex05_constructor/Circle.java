package ex05_constructor;

public class Circle extends Coord{
	
	// field
	private double radius;
	
	// constuctor
	public Circle(int x, int y, double radius) {
		super(x, y); // Coord클래스의 생성자를 호출
		this.radius = radius;
	}
	
	//method
	public void info() {
		System.out.println("중심 좌표 : [" + getX() + ", " + getY() + "]");
		System.out.println("반지름 : " + radius);
	}
}
