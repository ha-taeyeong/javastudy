package ex08_exception_class;

public class BankAccount {
	
	//field
	private String accNo;
	private long balance;

	
	public BankAccount(String accNO, long balance) {
		this.accNo = accNO ;
		this.balance = balance;
	}
	
	public void deposit(long money) throws BankAccountException {
		if(money <= 0) {
			throw new BankAccountException(money + "원은 입금이 불가능합니다.", 1000);
		}
		this.balance += money;
	}
	
	public long withdraw(long money) throws BankAccountException {
		if(money <= 0) {
			throw new BankAccountException(money + "원은 출금이 불가능합니다.", 2000);
		}else if(money > balance) {
			throw new BankAccountException("잔액이 부족합니다.", 2001);
		}
		this.balance -= money;
		return money;
	}
	
	public void transfer(BankAccount you, long money) throws BankAccountException {
		you.deposit(withdraw(money));
	}
	
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo + "잔액 : " + balance + "원");
	}
}