package ch02;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char c = 'A';
		char c = 65;
		// char c = '\u0041';
		System.out.println(c);
		// 숫자를 문자로 : 3 => '3'
		char c2 = 3 + '0'; // '3'
		System.out.println(c2);
		// 문자를 숫자로
		int i1 = c2 - '0'; // 3
		System.out.println(i1);
		// 문자열을 문자로 형변환
		String str = "hello"; // 0 번째 위치에 있는 문자를 꺼내보자.
		char c1 = str.charAt(0);
		System.out.println(c1);

		// 문자를 문자열로 형변환
		String str2 = c1 + "";
		System.out.println(str2);

		// 숫자를 문자열로 형변환
		String str3 = 7 + "";
		System.out.println(str3);

		String str4 = 7 + 7 + ""; // 14 + "" => "14"
		String str5 = "" + 7 + 7; // "7" + 7 => "77"

		System.out.println(str4);
		System.out.println(str5);

		// (int) 숫자형태의 문자열을 숫자로
		String str6 = "30000" + 10; // ==>"3000010"
		System.out.println(str6);
		int i6 = Integer.parseInt(str6) + 10;
		System.out.println(i6);

		// (double) 숫자형태의 문자열을 숫자로
		String str7 = "3.140002";
		double d2 = Double.parseDouble(str7) + 10; // new Double() X ,
		System.out.println(d2);
	}

}
