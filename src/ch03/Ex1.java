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
		// do-while 문으로 변경
		i = 0;
		do {
			System.out.printf("%2d helloworld\n", (i + 1));
			i++;
		} while (i < 10);

//		for (;;) {  // 무한 루트, 무한 반복문
//			System.out.println(totalAmount);
//		}

//		System.out.println("1 helloworld");
//		System.out.println("2 helloworld");
//		System.out.println("3 helloworld");
//		System.out.println("4 helloworld");
//		System.out.println("5 helloworld");

		// 함수(메서드)를 활용한 프로그램의 재활용, 유지보수성을 높이기 위해
		// 1부터 3까지의 합을 구하는 프로그램
		System.out.println(sum(1, 3));

		// 4부터 6까지의 합을 구하는 프로그램
		System.out.println(sum(4, 6));

		// 7부터 9까지의 합을 구하는 프로그램
		System.out.println(sum(7, 9));

		return;
	} // End of main method

	public static int sum(int i1, int i2) {
		int sum = 0;

		for (int j = i1; j <= i2; j++) {
			sum += j;
		}
		return sum;
	} // end of sum method

} // End of Ex1 class
