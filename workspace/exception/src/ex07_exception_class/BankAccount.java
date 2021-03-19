package ex07_exception_class;

public class BankAccount {
	
	//field
	private String accNo;
	private long balance;

	
	public BankAccount(String accNO, long balance) {
		this.accNo = accNO ;
		this.balance = balance;
	}
	
	public void deposit(long money) throws DepositException {
		if(money <= 0) {
			throw new DepositException(money + "원은 입금이 불가능합니다.");
		}
		this.balance += money;
	}
	
	public long withdraw(long money) throws WithdrawException {
		if(money <= 0) {
			throw new WithdrawException(money + "원은 출금이 불가능합니다.", 2000);

		}else if(money > balance) {
			throw new WithdrawException("잔액이 부족합니다.", 2001);

		}
		this.balance -= money;
		return money;
	}
	
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo + "잔액 : " + balance + "원");
		System.out.println("계좌번호 : " + accNo + "잔액 : " + balance + "원");
	}
	
	public void transfer(BankAccount you, long money) {
		//내 돈은 줄어든다. (출금)
		//withdraw(money);
		//내 돈은 늘어난다. (입금)
		//deposit(money);
		//you.deposit(withdraw(money));
		// 내통장에서 출금된 금액을 네 통장에 입금해 준다.
		
		try {
			you.deposit(withdraw(money));
		} catch (DepositException e) {
			System.out.println(e.getMessage());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println("예외코드: " + e.getErrorCode());
		}
		
	}
	
	
	
}