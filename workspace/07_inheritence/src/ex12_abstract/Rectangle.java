package ex12_abstract;

public class Rectangle extends Shape{
	
	// field
	private int width;	// λλΉ
	private int height;	 // λμ΄

	// constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	public double getArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
