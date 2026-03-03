package ch04;

public class Circle3 {
	// 생성자 오버로딩
	public Circle3() {
		color = "red";
		radius = 1.0;
	}

	public Circle3(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	public Circle3(String color) {
		this.color = color;
		this.radius = 1.0;
	}

	public Circle3(double radius) {
		this.color = "red";
		this.radius = radius;
	}

	String color;
	double radius;

	void printInfo() {
		System.out.printf("원의 색깔은 %s, 반지름은 %.1f \n", color, radius);
	}

}
