package ch04;

public class BallDemo {

	public static void main(String[] args) {
		Ball ball = new Ball();
		// 공의 반지름을 출력하라.
		System.out.println(ball.getRadius());
		// 공의 부피를 알아내서 출력하라.
		System.out.println(ball.getVolume());
		// 공의 반지름을 반으로 줄이고, 공의 반지름과 부피를 출력하라.
		ball.setRadius(ball.getRadius() / 2);
		// 공의 반지름을 출력하라.
		System.out.println(ball.getRadius());
		// 공의 부피를 알아내서 출력하라.
		System.out.println(ball.getVolume());

		ball.setRadius(-10);
		// 공의 반지름을 출력하라.
		System.out.println(ball.getRadius());
		// 공의 부피를 알아내서 출력하라.
		System.out.printf("구의 부피는 %.2f 입니다.", ball.getVolume());
	}

}
