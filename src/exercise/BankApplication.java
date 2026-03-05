package exercise;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String template = """
//				----------------------------------------------------
//				1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료
//				----------------------------------------------------
//				선택 >
//				""";
		String menu = "";
		int money;
		Account account = null;
		while (true) {
			// System.out.println(template);
			menu = in.nextLine();
			if (menu.equals("5"))
				break;
			switch (menu) {
			case "1" -> createAccount(in, account); // ==> 함수로 리팩토링
			case "2" -> accountInquiry();
			case "3" -> depositProcess();
			case "4" -> System.out.println("출금 처리 중...");
			default -> System.out.println("메뉴 확인 바랍니다.");
			}
		}
		System.out.println("프로그램 종료");

	}

	static void createAccount(Scanner in, Account account) {
		System.out.println("계좌 생성 처리 중...");
		// 사용자로부터 입력
		in.nextLine();
		account = new Account("111-111", "홍길동", 10000);
	}

	static void accountInquiry() {
		System.out.println("계좌 목록 처리 중...");
	}

	static void depositProcess() {
		System.out.println("예금 처리 중...");
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
