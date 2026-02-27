package ch03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 구구단 작성하기
		// 요구사항 - 사용자로부터 구구단 몇단을 출력할 것인지를 입력받아서 해당 단의 구구단을 출력하라.
		// 단, 2 ~ 9 단까지만 입력받아 출력한다. 그보다 작거나 큰 수가 입력되면 출력할 수 없다라고 하고 종료한다.
		// 수정 요구사항 - 여러 번 입력받아서 입력받은 단을 출력한다. -1 을 입력하면 구구단 출력을 멈춘다.
		// 기술적 요구사항 - while 문을 이용하여 여러번 입력받는 로직을 작성해주세요.
		// 변수 선언 부 위치 옮기기
		Scanner in = new Scanner(System.in);
		// 변수 선언 부 위치 옮기기
		int dan = 0;
//		while (true) {
//			System.out.print("구구단 몇단을 출력할까요 ? : ");
//
//			// 변수 선언 부 위치 옮기기
//			dan = in.nextInt();
//
//			// while 문 종료조건 추가하기
//			if (dan == -1)
//				break;
//
//			if (dan < 2 || dan > 9) {
//				System.out.println("2단부터 9단까지만 출력할 수 있습니다.");
//			} else {
//				for (int i = 1; i <= 9; i++) {
//					// System.out.println(dan + " X " + i + " = " + (dan * i));
//					System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
//				}
//			}
//		}

		do {
			System.out.print("구구단 몇단을 출력할까요 ? : ");

			// 변수 선언 부 위치 옮기기
			dan = in.nextInt();

			if (dan == -1)
				break;

			if (dan < 2 || dan > 9) {
				System.out.println("2단부터 9단까지만 출력할 수 있습니다.");
			} else {
				for (int i = 1; i <= 9; i++) {
					// System.out.println(dan + " X " + i + " = " + (dan * i));
					System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
				}
			}
		} while (dan != -1);

		System.out.println("프로그램을 종료합니다.");

//		System.out.println(dan + " X 1 = " + (dan * 1));
//		System.out.println(dan + " X 2 = " + (dan * 2));
//		System.out.println(dan + " X 3 = " + (dan * 3));
//		System.out.println("2 X 4 = 8");
//		System.out.println("2 X 5 = 10");
//		System.out.println("2 X 6 = 12");
//		System.out.println("2 X 7 = 14");
//		System.out.println("2 X 8 = 16");
//		System.out.println("2 X 9 = 18"); // 변하는 부분과 변하지 않는 부분으로 나누고 수식 찾아내서 해결하기

	}

}
