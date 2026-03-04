package ch05;

public class StringMethodDemo {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Java";
		String s3 = "hello";

		System.out.println("s1 의 문자열 길이는 ? " + s1.length());
		System.out.println(s2.charAt(2));
		System.out.println(s2.toUpperCase() + ":" + s2);

		// 서브스트링
		System.out.println(s3.substring(1)); // ello
		System.out.println(s3.substring(1, 3)); // el

	}

}
