package ch07;

public interface MyInterface {
	// 상수
	int MAX = 10; // public static final int MAX = 10;
	int MIN = 1; // public static final

	// abstract 메서드
	void sayHello(); // public abstract

	void sayHi();

	default void talk() {
	} // 표준의 변경 - v1

	default void sing() {
	} // 표준의 변경 - v2
}

class MyClass implements MyInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");// TODO Auto-generated method stub
	}

	@Override
	public void sayHi() {
		System.out.println("hi");// TODO Auto-generated method stub
	}

}

class YourClass implements MyInterface {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("hi");

	}

	@Override
	public void talk() {
		System.out.println("talk");

	}

}
