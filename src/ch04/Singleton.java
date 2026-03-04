package ch04;

public class Singleton {
	// static 변수
	private static Singleton singleton = new Singleton();

	// 외부에서 객체를 생성할 수 없어야 한다. (내부에서 생성)
	private Singleton() {

	}

	// 객체에 대한 접근을 허용해줘야 한다.
	static Singleton getInstance() {
		return singleton;
	}
}
