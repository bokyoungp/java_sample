package exercise;

public class Circle {
//   예제 : Circle instance를 만들 때마다 빨간색의 크기가 100인 circle이 1개 생성되었습니다.
//   노란색의 크기가 50인 circle이 2개 생성되었습니다.를 출력하는 클래스를 작성하시오.

	// 생성자
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
		numCircle++;
		numOfCircles++;
	}

	// 필드
	String color;
	double radius;
	static int numOfCircles;
	int numCircle;

	// 메서드
	void printInfo() {
		System.out.printf("%s , 크기가 %.1f 인 공이 %d 개(%d) 생성되었습니다. \n", color, radius, numOfCircles, numCircle);
	}

	void instanceMethod() {
		this.printInfo();
		printInfo();
		staticMethod();
		staticMethod2();
	}

	static void staticMethod() {
		staticMethod2();
		// instanceMethod();
		numOfCircles++;
		// numCircle++;
	}

	static void staticMethod2() {

	}
}
