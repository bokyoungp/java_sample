package ch04;

public class Ball {
	// 필드
	private double radius = 10.0; // 캡슐화, 은닉
	final double PI = 3.14159;

	// getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r > 0) {
			radius = r;
		}
	}

	// 메서드
	double getVolume() {
		return (double) 4 / 3 * PI * radius * radius * radius;
	}
}
