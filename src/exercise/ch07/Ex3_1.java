package exercise.ch07;

public class Ex3_1 {

	public static void main(String[] args) {
		Line line1 = new Line(3);
		Line line2 = new Line(5);

		int res = line1.compareTo(line2);
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
		if (o instanceof Line line) {
			return this.length - line.length;
		}
		return -999999;
	}

	public Line(int length) {
		this.length = length;
	}

}
