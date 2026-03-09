package ch08;

import java.util.Objects;

public class KeyboardDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitec");
		Mouse m2 = new Mouse("Logitec");

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));

		Keyboard k1 = new Keyboard("Logitec", "L001", 10000);
		Keyboard k2 = new Keyboard("Logitec", "L002", 12000);
		// k1 = k2;

		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		if (k1.equals(k2)) {
			System.out.println(k1 + " 키보드 입니다.");
		} else {
			System.out.println("서로 다른 키보드 입니다.");
		}

	}

}

class Keyboard {
	// 변수
	String name; // 제조사
	String model; // 모델
	int price; // 금액
	// String f1, f2, f3, f4, f5, f6, f7;

	// 생성자
	public Keyboard(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
//			System.out.println("완벽히 동일한 객체입니다.");
			return true;
		} else if (obj instanceof Keyboard keyboard) {
//			System.out.println("동일한 모델입니다.");
			System.out.println(this.hashCode() + ":" + keyboard.hashCode());
			return this.hashCode() == keyboard.hashCode();
		}
//		System.out.println("다른 객체이거나 모델이 다릅니다.");
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, model, price);
	}

	@Override
	public String toString() {
		return name;
	}

}

class Mouse {
	// 변수
	String name;
	// 생성자

	public Mouse(String name) {
		this.name = name;
	}
}