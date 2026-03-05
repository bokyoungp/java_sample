package ch05;

public class BeforeEnumDemo {
	public static void main(String[] args) {
		final int MALE = 1;
		final int FEMALE = 2;

		final int EAST = 0;
		final int WEST = 1;

		System.out.println(Direction.EAST);

		Person person = new Person();
		person.age = 20;
		person.gender = Gender.MALE;
		if (person.gender == Gender.MALE) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}

		System.out.println(Gender.MALE.compareTo(Gender.FEMALE));
		System.out.println(person.gender);
	}
}

class Person {
	// 변수
	int age;
	Gender gender; // 0 : Male, 1 : Female

}

enum Gender {
//	MALE, FEMALE
	MALE("Man"), FEMALE("Woman");

	// 필드
	String s;

	// 생성자
	Gender(String s) {
		this.s = s;
	}

	// 메서드
	@Override
	public String toString() {
		return s;
	}
}

enum Direction {
	EAST, WEST, SOUTH, NORTH
}
