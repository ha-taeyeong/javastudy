package ex03_overloading;

public class Rectangle {
	
	//field
	int width; // 너비
	int height; // 높이
	
	//method
	void set(int w, int h) {
		if(w > 0) {
			width = w;
		}
		if(h > 0) {
		height = h;
		}
	}
	
	void set(int n) {
		// 다른 set() 메소드를 호출해서 처리합니다.
		set(n, n); // void set(int w, int h)로 전달
	}
	
	int getArea() {
		return width * height;
	}
}
