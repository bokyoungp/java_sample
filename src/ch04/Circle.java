package ch04;

public class Circle {
	// 필드
	private double radius = 10.0; // 캡슐화, 은닉
	final double PI = 3.14;

	// getter, setter 참조,설정 메서드
	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r > 0) {
			radius = r;
		}
	}

	// 메서드
	double getArea() { // 넓이 구하는 공식
		return PI * radius * radius;
	}
}
