package exercise.ch06;

public class Ex1 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.show();

		ColoredCircle cc = new ColoredCircle(5, "빨간색");
		cc.show();
	}
}

class Circle {
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	// 필드
	int radius;

	// 메서드
	void show() {
		System.out.println("반지름이 " + radius + " 인 원이다.");
	}
}

class ColoredCircle extends Circle {
	// 생성자
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	// 필드
	String color;

	// 메서드
	void show() {
		System.out.println("반지름이 " + radius + " 인 " + color + " 원이다.");
	}
}
