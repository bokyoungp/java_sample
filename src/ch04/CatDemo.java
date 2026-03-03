package ch04;

public class CatDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = c1;
		Cat c3 = c2;

		System.out.println("고양이의 이름은 " + c1.name);
		System.out.println("고양이의 이름은 " + c2.name);
		System.out.println("고양이의 이름은 " + c3.name);

		c1.name = "야옹이";
		System.out.println("고양이의 이름은 " + c1.name);
		System.out.println("고양이의 이름은 " + c2.name);
		System.out.println("고양이의 이름은 " + c3.name);

		String s1 = "나비";
		String s2 = s1;

		System.out.println("s1 문자열은 " + s1);
		System.out.println("s2 문자열은 " + s2);

		s1 = "야옹이";

		System.out.println("s1 문자열은 " + s1);
		System.out.println("s2 문자열은 " + s2);
	}

}
