package exercise.ch07;

public class Ex3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10, 10);
		Triangle t2 = new Triangle(5, 10);

		int res = t1.compareTo(t2);
		if (res == -999999) {
			System.out.println("삼각형과 비교할 수 없는 객체입니다.");
		} else if (res < 0) {
			System.out.println(t2 + "가 더 큽니다.");
		} else if (res > 0) {
			System.out.println(t1 + "가 더 큽니다.");
		} else {
			System.out.println(t1 + " 과 " + t2 + " 의 넓이가 같습니다.");
		}
	}

}

class Triangle implements Comparable {
	// 생성자
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	// 변수
	int height;
	int width;

	@Override
	public int compareTo(Object o) {
		if (o instanceof Triangle triangle) {
			return (int) (this.findArea() - triangle.findArea());
		}
		return -999999;
	}

	double findArea() {
		return (height * width) / (double) 2;
	}

	@Override
	public String toString() {
		return String.format("삼각형 [width = %d, height = %d, 넓이 = %d]", width, height, (int) this.findArea());
	}

}