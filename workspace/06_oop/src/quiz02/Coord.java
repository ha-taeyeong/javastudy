package quiz02;

public class Coord {
	
	//field
	private int x;
	private int y;
	//constructor
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void info() {
		System.out.println("중심좌표 " + "[" + x + "," + y + "]");
	}
	
}