package ch04;

public class CircleDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 " + circle.getRadius() + "입니다.");

		Circle circle2 = new Circle(30);
		System.out.println("원의 반지름은 " + circle2.getRadius() + "입니다.");

		// 변수 = 값 ==> 값을 왼쪽의 변수에 할당한다.
		circle.setRadius(5.0);
		System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 " + circle.getRadius() + "입니다.");

		circle.setRadius(0);
		System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 " + circle.getRadius() + "입니다.");

		circle.setRadius(-10);
		System.out.println("원의 넓이는 " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 " + circle.getRadius() + "입니다.");

	}

}
