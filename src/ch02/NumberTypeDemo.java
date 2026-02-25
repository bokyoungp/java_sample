package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 소리가 1시간(60 * 60 초) 동안 가는 거리
		int mach;
		int distance;
		mach = 340.0f; // double 또는 float 을 int 로 명시적(강제) 형변환
		distance = 60 * 60 * mach;
		System.out.printf("소리가 1시간(60 * 60 초) 동안 가는 거리는 %d 입니다. \n", distance);

		// 반지름이 10.0 인 원의 넓이
		final double PI = 3.14;
		// int radius = 10;
		double radius = 10; // int 가 double 로 자동 형변환
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0 인 원의 넓이는 %.2f 입니다. \n", area);

		long l = (long) 3.14d;

	}

}
