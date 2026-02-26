package ch03;

public class ConditionDemo {

	public static void main(String[] args) {
		// 조건문 (if, switch)
		int i = 0;
		if (i == 0) { // 조건식이 true 이면 {} 안의 실행문이 실행됨.
			// 실행문
			System.out.println("hello world");
		}
		int j = 0;
		if (j == 0) {
			System.out.println("hello world");
		}

		int k = 1;
		if (k == 0) {
			System.out.println("hello world");
			System.out.println("hello world");
		}

		// 3 < a < 5 실행하는 조건문
		int a = 4;
		if (3 < a && a < 5) {
			System.out.println("a는 3보다 크고 5보다 작습니다.");
		}
		// x 가 0보다 작거나 100보다 크면 실행하는 조건문
		int x = -1;
		if (x < 0 || x > 100) {
			System.out.println("x 가 0보다 작거나 100보다 큽니다.");
		}

		// 짝수인지 홀수인지 출력하는 조건문
		int res = 2 % 2;
		if (res == 0) {
			System.out.println("짝수입니다.");
		}
		if (res == 1) {
			System.out.println("홀수입니다.");
		}

		// if-else
		if (res == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 삼항(조건)연산자
		String result = (res == 0) ? "짝수입니다" : "홀수입니다.";
		System.out.println(result);
	}

}
