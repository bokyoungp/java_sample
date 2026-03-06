package exercise.ch06;

public class Ex6 {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);

		System.out.println(c.color);
		c.show();

		Car c1 = new Car("빨강", 180, 900, 4);
		c1.show();

		System.out.println();
		Vehicle v = c;
		System.out.println(v.color);
//		System.out.println(v.displacement);
//		System.out.println(v.gears);
		v.show();

	}

}

class Vehicle {
	// 필드
	String color;
	int speed;

	// 메서드
	void show() {
		System.out.println(color + "색 , 최고 속도 " + speed + "의 자동차");
	}

	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}

class Car extends Vehicle {
	// 필드
	int displacement; // 배기량
	int gears; // 기어단수
	// 메서드

	void show() {
		System.out.println(color + "색 , 최고 속도 " + speed + " , 배기량 " + displacement + " , 기어 " + gears + " 의 자동차");
	}

	// 생성자
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
}
