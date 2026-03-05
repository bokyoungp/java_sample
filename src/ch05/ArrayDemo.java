package ch05;

public class ArrayDemo {

	public static void main(String[] args) {
		// 요구사항 - 10명의 학생의 점수를 각각 저장하고 합계와 평균을 구해주세요.

		// 변수에는 정해진 크기의 데이터를 한 개 담아놓을 수 있다.
		int score1 = 100;
		int score2 = 90;
		int score3 = 85;
		int score4 = 100;
		int score5 = 90;
		int score6 = 85;
		int score7 = 100;
		int score8 = 90;
		int score9 = 85;
		int score10 = 100;

		int total = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
		double avg = total / (double) 10;

		String res = String.format("합계 = %d, 평균 = %.2f 입니다.", total, avg);
		System.out.println(res);
		// 정해진 크기의 여러 개(다섯개)의 데이터를 하나의 변수에 담는 방법 ==> 배열
		int[] scores = { 100, 90, 80, 95, 90, 80, 85, 70, 60, 100 };
		System.out.println(scores.length);
		total = 0;
		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i];
		}

		res = String.format("합계 = %d, 평균 = %.2f 입니다.", total, total / (double) scores.length);
		System.out.println(res);
	}

}
