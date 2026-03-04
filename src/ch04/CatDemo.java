package ch04;

public class CatDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비");
		Cat c2 = c1;
		c2 = new Cat("야옹이");
		Cat c3 = c2;

		System.out.println("c1 고양이의 이름은 " + c1.getName());
//		System.out.println("고양이의 이름은 " + c2.name);
//		System.out.println("고양이의 이름은 " + c3.name);

		// c1.setName("야옹이");
		System.out.println("c2 고양이의 이름은 " + c2.getName());
//		System.out.println("고양이의 이름은 " + c2.name);
//		System.out.println("고양이의 이름은 " + c3.name);

		String s1 = "나비";
		String s2 = s1;

		System.out.println("s1 문자열은 " + s1);
		System.out.println("s2 문자열은 " + s2);

		s1 = "야옹이";

		System.out.println("s1 문자열은 " + s1);
		System.out.println("s2 문자열은 " + s2);
	}

}
