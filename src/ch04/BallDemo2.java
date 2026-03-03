package ch04;

public class BallDemo2 {

	public static void main(String[] args) {
		// 공 3개만 생성
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		Ball b3 = new Ball();

		b2.setRadius(20.0);
		b3.setRadius(5.0);

		System.out.println(b1 == b2);
		System.out.println(b1.getRadius() + ":" + b2.getRadius());
		// 공 3개의 반지름을 각각 출력하라.
		System.out.printf("%.2f, %.2f, %.2f \n", b1.getRadius(), b2.getRadius(), b3.getRadius());

		b1 = b2;
		// == , != 기초타입에만 사용할 수 있는 비교연산자

		System.out.println(b1 == b2);
		System.out.println(b1.getRadius() + ":" + b2.getRadius());

		b1.setRadius(30.0);
		System.out.println(b1.getRadius() + ":" + b2.getRadius());

		int i = 10, j = 5;
		System.out.printf("i = %d, j = %d \n", i, j);

		i = j;
		System.out.printf("i = %d, j = %d \n", i, j);

		i = 10;
		System.out.printf("i = %d, j = %d \n", i, j);
	}

}
