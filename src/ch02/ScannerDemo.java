package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 정수를 입력받아서 출력

//		System.out.print("(정수)숫자를 하나 입력하세요 : ");
//		int input = in.nextInt();
//		System.out.printf("당신이 입력한 숫자는 %d 입니다.", input);

		// 문자열을 입력받아서 숫자로 변환한 후 출력
//		System.out.print("(정수)숫자를 하나 입력하세요 : ");
//		String input = in.nextLine();
//		int intInput = Integer.parseInt(input);
//		System.out.printf("당신이 입력한 숫자는 %d 입니다.", intInput);

		// 두 개의 정수를 입력받아서 연산 결과를 출력한다.
		System.out.print("(정수)첫 번째 숫자를 입력하세요 : ");
		int x = in.nextInt();

		System.out.print("(정수)두 번째 숫자를 입력하세요 : ");
		int y = in.nextInt();

		System.out.printf("%d 와 %d 를 곱한 결과는 %d 입니다.", x, y, x * y);
	}

}
