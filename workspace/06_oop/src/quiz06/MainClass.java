package quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		Bakery bakery1 = new Bakery(100, 1000, 10000); // 빵100개, 가격1000원, 자본금10000원
		Bakery bakery2 = new Bakery(50, 500, 10000); // 빵50개, 가격500원, 자본금10000원
		
		Customer customer = new Customer(20000); // 가진돈 20000원
		
		customer.buy(bakery1, 10000); // bakery1에서 10개 구입 - 빵10개, 남은돈 10000원
		customer.buy(bakery2, 10000); // bakery2에서 20개 구입 - 빵30개, 남은돈 0원
		
		bakery1.info(); // 빵 90개, 자본금20000원
		bakery2.info(); // 빵 30개, 자본금20000원
		
	}
}
