package ch02;

public class OperateDemo {

	public static void main(String[] args) {
		// 오버플로우 발생을 막기 위해 피연산자중 하나를 타입 변환 했음
//		int i = 1_000_000;
//		int j = 2_000_000;
//
//		long result = (long) i * j;
//
//		System.out.println(result);

		// 무한대와 NaN 예제
		// int res = 5 / 0;
		double res = 5 / 0.0;

		System.out.println(Double.isInfinite(res));
		if (Double.isInfinite(res)) {
			System.out.println("무한대값을 반환했습니다.");
		} else {
			System.out.println(res + 100);
		}

		// NaN

		double res2 = 5 % 0.0;
		System.out.println(res2);
		if (Double.isNaN(res2)) {
			System.out.println("숫자가 아닙니다.");
		} else {
			System.out.println(res2 + 100);
		}
	}

}
