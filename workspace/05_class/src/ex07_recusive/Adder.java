package ex07_recusive;

public class Adder {
	
	private int total; // 0으로 초기화
	
	public void calculate(int n) {
		if(n == 0) {
			return;
		}
			total += n;
			calculate(n - 1);
}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
