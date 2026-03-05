package exercise.ch06;

public class Ex3 {

	public static void main(String[] args) {
		// 사람, 학생, 외국학생을 각각 원소로 하는 배열선언하고 for-each 로 각 내용을 출력하라.

	}

}

class Person {
	// 필드 - 이름, 나이

	// 메서드 - 접근자와 생성자, show()

	// 생성자 - 모든 필드를 초기화하는 생성자
}

class Student extends Person {
	// 필드 - 학번

	// 메서드 - 접근자와 생성자, show()

	// 생성자 - 모든 필드를 초기화하는 생성자
}

class ForeignStudent extends Student {
	// 필드 - 국적

	// 메서드 - 접근자와 생성자, show()

	// 생성자 - 모든 필드를 초기화하는 생성자
}