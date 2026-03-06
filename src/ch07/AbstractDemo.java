package ch07;

public class AbstractDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();

		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle();

		drawShape(circle);

	}

	static void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		// instanceof Circle1 원의 경우에는 반지름을 설정한 후 원을 그린다.
		// 삼각형이라면 밑변과 높이를 설정한 후 삼각형을 그린다.
		if (shape instanceof Circle c) {
			c.setRadius(5);
			c.draw();
		}
	}

}

abstract class Shape {
	// 추상 메서드
	abstract void draw();

	public void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle extends Shape {
	// 필드
	private int radius;

	// 접근자, 설정자, toString
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메서드 - 오버라이드

	@Override
	public void area() {
		System.out.println("원의 넓이");
	}

	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");

	}
}
