package ex07_recusive;

public class Calculator {

	public int getFatorial(int n) {

		if(n == 1) {
			return 1;
		}else {
			return n * getFatorial(n-1);
		}
	}
}