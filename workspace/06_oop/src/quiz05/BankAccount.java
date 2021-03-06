package quiz05;

public class BankAccount {
	
	//field
	private String accNo;
	private long balance;

	
	public BankAccount(String accNO, long balance) {
		this.accNo = accNO ;
		this.balance = balance;
	}
	
	public void deposit(long money) {
		if(money <= 0) {
			System.out.println(money + "원은 입금이 불가능합니다.");
			return;
		}
		this.balance += money;
	}
	
	public long withdraw(long money) {
		if(money <= 0) {
			System.out.println(money + "원은 출금이 불가능합니다.");
			return 0;
		}else if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		this.balance -= money;
		return money;
	}
	
	public void transfer(BankAccount you, long money) {
		you.deposit(withdraw(money));
	}
	
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo + "잔액 : " + balance + "원");
	}
}