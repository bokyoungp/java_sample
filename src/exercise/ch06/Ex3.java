package exercise.ch06;

public class Ex3 {

	public static void main(String[] args) {
		// 사람, 학생, 외국학생을 각각 원소로 하는 배열선언하고 for-each 로 각 내용을 출력하라.
		Person[] persons = new Person[3];
		persons[0] = new Person(22, "길동이");
		persons[1] = new Student(23, "황진이", "100");
		persons[2] = new ForeignStudent(30, "Amy", "200", "U.S.A");

		// ==> for-each 로 변경하기
		persons[0].show();
		persons[1].show();
		persons[2].show();

		for (Person person : persons) {
			person.show();
		}

	}

}

class Person {
	// 필드 - 이름, 나이
	private int age;
	private String name;

	// 메서드 - 접근자와 설정자, show()
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("사람[이름:" + name + ", 나이 : " + age + "]");
	}

	// 생성자 - 모든 필드를 초기화하는 생성자
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class Student extends Person {
	// 필드 - 학번
	private String studentNo;
	// 메서드 - 접근자와 설정자, show()

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public void show() {
		System.out.println("사람[이름:" + super.getName() + ", 나이 : " + super.getAge() + ", 학번 : " + studentNo + "]");
	}

	// 생성자 - 모든 필드를 초기화하는 생성자
	public Student(int age, String name, String studentNo) {
		super(age, name);
		this.studentNo = studentNo;
	}
}

class ForeignStudent extends Student {
	// 필드 - 국적
	private String nationality;
	// 메서드 - 접근자와 설정자, show()

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public void show() {
		System.out.println("사람[이름:" + super.getName() + ", 나이 : " + super.getAge() + ", 학번 : " + super.getStudentNo()
				+ ", 국적 : " + nationality + "]");
	}

	// 생성자 - 모든 필드를 초기화하는 생성자
	public ForeignStudent(int age, String name, String studentNo, String nationality) {
		super(age, name, studentNo);
		this.nationality = nationality;
	}

}