package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName() + ":" + person.getAge());
		person.setNationality("대한민국").setName("민국").setAge(20).sayHello();

	}

}
