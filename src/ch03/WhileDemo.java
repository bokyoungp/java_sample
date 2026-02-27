package ch03;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// 사용자로부터 입력을 계속 받아서 프로그램을 실행한다.
		// 사용자가 -1 을 입력하면 프로그램을 종료한다.
		Scanner in = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.print("숫자를 입력하세요. 종료하려면 -1 을 입력하세요. : ");
			number = in.nextInt();
			if (number == -1)
				break;
			System.out.println("계속 실행합니다.!");
		}
		System.out.println("프로그램을 종료합니다.!");
	}

}
