package ch06;

public class UpcastingDemo {

	public static void main(String[] args) {
		Circle1[] circles = new Circle1[3];
		circles[0] = new Circle1();

		Triangle[] triangles = new Triangle[3];
		triangles[0] = new Triangle();

		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape();
		shapes[1] = new Circle1();
		shapes[2] = new Triangle();

		for (Shape shape : shapes) {
			shape.area();
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
	// 메서드 - 오버라이드
	@Override
	public void area() {
		System.out.println("삼각형의 넓이");
	}
}
