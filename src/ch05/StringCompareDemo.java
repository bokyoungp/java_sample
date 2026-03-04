package ch05;

public class StringCompareDemo {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "c";
		String str3 = "A";

		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));

		System.out.println(str1.equalsIgnoreCase(str3));
		if (str1.compareTo(str2) < 0) {
			System.out.println(str1 + "이 " + str2 + " 보다 사전 순으로 더 먼저 나옵니다.");
		} else if (str1.compareTo(str2) == 0) {
			System.out.println("같은 내용을 가진 문자열입니다.");
		} else {
			System.out.println(str2 + "이 사전 순으로 더 먼저 나옵니다.");
		}
	}
}
