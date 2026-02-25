package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {
		// 연산에서의 자동 형변환 / <- 정수의 나눗셈(몫, 정수)
		int v1 = 10;
		int v2 = 3;
		double res1 = 7 / (double) 4;
		System.out.println(res1);

		// 실수의 나눗셈 -> 소숫점 까지 포함한 결과
		double res2 = 10.0 / 3.0;
		System.out.println(res2);

		// 실수를 정수로 나누면 ?
		double res3 = 10.0 / 3;
		// int res4 = 10.0 / 3;
		System.out.println(res3);
	}

}
