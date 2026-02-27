package ch03;

public class ReturnDemo {

	public static void main(String[] args) {
		printScore(90);
		printScore(100);
		printScore(-10);
	}

	public static void printScore(int score) {
		// 입력받은 인자(점수)를 출력하는 함수
		// 단, 0~100 점 사이의 값이 아닌 점수가 전달되면 잘못된 점수입니다.를 출력하고 메서드를 종료하라.
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수 " + score + "입니다.");
			return;
		}
		System.out.println("당신의 점수는 " + score + " 점 입니다.");
		// return;
	}

}
