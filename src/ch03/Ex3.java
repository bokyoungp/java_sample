package ch03;

public class Ex3 {

	public static void main(String[] args) {
		// 중첩 반복문

		System.out.println(" 1  2  3");
		System.out.println(" 2  3  4");
		System.out.println(" 3  4  5");

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("  %2d", i + j);
			}
			System.out.println();
		}

	}

}
