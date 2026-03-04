package ch04;

public class Person {
	// 생성자
	// 필드(캡슐화되어 있는 경우에는 접근자와 설정자를 생성)
	private String name;
	private int age;
	private String nationality;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	// 메서드
	void sayHello() {
		System.out.println("안녕, 나는 " + nationality + " 사람이고, 이름은 " + name + " 이고 " + age + " 살이야");
	}
}
