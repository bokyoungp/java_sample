package ch04;

public class ATM {
	// 생성자-기본 생성자, default 생성자는 컴파일러가 자동으로 코드를 생성해준다.
	public ATM() { // 인스턴스 변수의 값을 원하는 값으로 초기화
		location = "오리역";
		managedBy = "연구원";
	}

	public void identifies() {
		System.out.println(location);
	}

	public String location; // null 로 초기화(객체 생성시)
	public String managedBy; // null 로 초기화(객체 생성시)

	public void transactions() {

	}
}
