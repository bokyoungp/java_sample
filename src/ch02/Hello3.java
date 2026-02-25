package ch02;

public class Hello3 { // 클래스

	public static void main(String[] args) { // 메서드(특정 목적을 달성하기 위한 코드의 모음)
//		메인 메서드 내부
		System.out.println("안녕"); // 화면에 문자열을 직접 출력
		int v1 = 3; // 변수의 선언과 값 할당을 동시에 함
		System.out.println(v1); // 화면에 변수의 값을 출력
		String str = "hello";
		System.out.println(str); // 화면에 변수의 값을 출력
		System.out.print(str);
		System.out.print(str);
		System.out.print(str);
		System.out.println(" ");
		System.out.printf("%d     %d", v1, v1);
		System.out.printf("%s     %s", str, str);
		System.out.printf("%.2f     %f", 3.14, 3.14);
	}

}
