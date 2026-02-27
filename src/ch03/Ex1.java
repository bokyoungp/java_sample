package ch03;

public class Ex1 {

	public static void main(String[] args) {
		// 변수를 활용한 프로그램의 가독성, 재활용, 유지보수성이 높은 프로그램
		// 고객의 요구사항 : 50 * 60 의 결과를 10번 출력해달라
		int x = 50, y = 60;
		int totalAmount = x * y;

		// 반복문을 활용한 프로그램의 재활용,가독성, 유지보수성이 높은 프로그램
		for (int i = 0; i < 10; i++) { // i <= 9 , i < 10 , i = 0,1,2,3,4,5,6,7,8,9
			// System.out.println((i + 1) + " helloworld"); // k = 1,2,3,4,5,6,7,8,9,10
			System.out.printf("%2d helloworld\n", (i + 1));
		}
		// while 문으로 변경
		int i = 0;
		while (i < 10) {
			System.out.printf("%2d helloworld\n", (i + 1));
			i++;
		}

//		for (;;) {  // 무한 루트, 무한 반복문
//			System.out.println(totalAmount);
//		}

//		System.out.println("1 helloworld");
//		System.out.println("2 helloworld");
//		System.out.println("3 helloworld");
//		System.out.println("4 helloworld");
//		System.out.println("5 helloworld");

		// 함수(메서드)를 활용한 프로그램의 재활용

	}

}
