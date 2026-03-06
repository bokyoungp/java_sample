package ch06;

public class UpcastingDemo {

	public static void main(String[] args) {
		Circle1 circle = new Circle1();
		Triangle triangle = new Triangle();

		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape();
		shapes[1] = new Circle1();
		shapes[2] = new Triangle();

		for (Shape shape : shapes) {
			shape.area();
		}

		drawShape(circle);
		drawShape(triangle);

	}

//	static void drawShape(Circle1 circle) {
//		System.out.println("원을 그립니다.");
//	}
//	
//	static void drawShape(Triangle triangle) {
//		System.out.println("삼각형을 그립니다.");
//	}

	static void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		// instanceof Circle1 원의 경우에는 반지름을 설정한 후 원을 그린다.
		// 삼각형이라면 밑변과 높이를 설정한 후 삼각형을 그린다.
		if (shape instanceof Circle1 c) {
			c.setRadius(5);
			c.draw();
		} else if (shape instanceof Triangle t) {
			t.setBase(5);
			t.setHeight(10);
			t.draw();
		}
	}

}

class Shape {
	// 메서드
	public void draw() {
	}

	public void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle1 extends Shape {
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

}

class Triangle extends Shape {
	// 필드
	private int base;
	private int height;

	// 접근자, 설정자, toString
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메서드 - 오버라이드
	@Override
	public void area() {
		System.out.println("삼각형의 넓이");
	}

}
