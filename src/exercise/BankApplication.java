package exercise;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Account {
	// 비즈니스 도메인의 비즈니스 로직, 룰 정의되어 있어야 함.
	// 생성자
	public Account(String accountNo, String accountOwner, int balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	// 필드
	private String accountNo;
	private String accountOwner;
	private int balance;

	// 접근자(모든 변수에 대해서 열어놓고), 설정자(비즈니스 도메인의 로직에 맞게 조정)
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public int getBalance() {
		return balance;
	}

	// 메서드 ( 입금, 출금, 조회 )
	public void deposit(int money) {
		// overflow 고려해서 refactoring 할것 ==> 검증 필요
		long total = balance + money;
		if (total <= 2_000_000_000)
			balance = balance + money;

	}

	public void withdraw(int money) {
		if (balance >= money)
			balance = balance - money;
	}

	public int inquiry() {
		return balance;
	}

}
