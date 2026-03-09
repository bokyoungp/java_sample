package exercise.ch07;

import ch04.Circle;

public class Ex3_1 {

	public static void main(String[] args) {
		// Comparable comp = new Line(3);
		Comparable comp = new Circle();

		Line line1 = new Line(3);
		Line line2 = new Line(5);
		Line line3 = null;
		Circle circle = new Circle();

//		int res = line2.compareTo(line3); //  NullPointerException
		// comp.compareTo(line1);
		int res = line2.compareTo(circle); // ClassCastException
		System.out.println(res);
		if (res == -999999) {
			System.out.println("선과 비교할 수 없는 객체입니다.");
		} else if (res > 0) {
			System.out.println("line1 이 더 깁니다.");
		} else if (res == 0) {
			System.out.println("두 선의 길이가 같습니다.");
		} else {
			System.out.println("line2 이 더 깁니다.");
		}
	}

}

class Line implements Comparable {
	int length;

	@Override
	public int compareTo(Object o) {
//		Line line = (Line) o;
//		return this.length - line.length;

		if (o instanceof Line line) {
			System.out.println("라인의 크기 비교");
			return this.length - line.length;
		}
		return -999999;
	}

	public Line(int length) {
		this.length = length;
	}

}
