package exercise.ch07;

public class Ex6 {

	public static void main(String[] args) {
		Human human = new Worker();
		human.eat();
		human.print();

		Human human1 = new Student();
		human1.eat();
		human1.print();
	}

}

interface Human {
	void eat();

	default void print() {
	}
	// print() 메서드를 추가해야 함
	// 이미 다른 프로젝트에서 사용되고 있는 기존 클래스들이 영향을 받지 않도록 인터페이스에 새로운 기능을
	// 추가하라. ==> 디폴트 메서드
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");

	}

}

class Student implements Human {

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");

	}

	@Override
	public void print() {
		System.out.println("출력합니다.");

	}

}