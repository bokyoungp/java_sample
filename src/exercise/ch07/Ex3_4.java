package exercise.ch07;

import java.util.Arrays;

public class Ex3_4 {

	public static void main(String[] args) {
		Person[] persons = { new Person("손흥민", 20, 180, 70), new Person("박지성", 40, 175, 68),
				new Person("홍길동", 32, 170, 75), };

		Arrays.sort(persons);

		System.out.println("실행결과 : ");
		// System.out.println(Arrays.toString(persons));

		for (Person person : persons) {
			System.out.println(person);
		}

	}

}

class Person implements Comparable {
	// 변수
	String name;
	int age;
	int height;
	int weight;

	// 생성자
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 객체의 비교
	@Override
	public int compareTo(Object o) {
		if (o instanceof Person person) {
			return person.age - this.age;
		}
		return -999999;
	}

	// 객체의 내용을 출력
	@Override
	public String toString() {
		return String.format("Person [이름 = %s, 나이 = %d, 키 = %d, 몸무게 = %d]", name, age, height, weight);
	}

}
