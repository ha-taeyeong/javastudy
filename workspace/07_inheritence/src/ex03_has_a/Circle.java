package ex03_has_a;

public class Circle extends Coord {
	
	// field
	private double radius;
	
	// method
	public void setCircle(int x, int y, double radius) {
		set(x, y);
		this.radius = radius;
	}
	public void circleInfo() {
		System.out.print("중심좌표: ");
		info();
		System.out.println("반지름 : " + radius);
	}
	
}
