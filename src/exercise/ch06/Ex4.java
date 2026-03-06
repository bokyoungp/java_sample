package exercise.ch06;

public class Ex4 {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();

	}

}

class Parent {
	// 필드
	String name = "영조";

	// 메서드
	void print() {
		System.out.println("영조입니다.");
	}
}

class Child extends Parent {
	// 필드
	String name = "사도세자";

	// 메서드
	@Override
	void print() {
		System.out.println("사도세자입니다.");
	}
}
