package exercise;

public class CircleEx {

	public static void main(String[] args) {
		// 예제 : Circle instance를 만들 때마다 빨간색의 크기가 100인 circle이 1개 생성되었습니다.
		// 노란색의 크기가 50인 circle이 2개 생성되었습니다.를 출력하는 클래스를 작성하시오.
		Circle c1 = new Circle("빨간색", 100);
		c1.printInfo();
		Circle c2 = new Circle("노란색", 50);
		c2.printInfo();
		Circle c3 = new Circle("파란색", 30);
		c3.printInfo();

	}

}
