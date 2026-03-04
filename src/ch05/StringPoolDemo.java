package ch05;

public class StringPoolDemo {

	public static void main(String[] args) {
		// --------- 자바가 최적화 하기 전
		String str1 = new String("hello");
		String str2 = new String("hello");

		str1 = str2;

		str2 = "hello2";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(str2);

		// --------- 자바가 최적화 한 후

		String s1 = "hello";
		String s2 = "hello";

		s2 = "hello2";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
