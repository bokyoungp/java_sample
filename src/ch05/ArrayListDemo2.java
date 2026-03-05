package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 동적 배열을 이용해서 정해져 있지 않은 수의 학생의 점수를 입력받아서, 총점과 평균을 구해보자.
		Scanner in = new Scanner(System.in); // 사용자로부터 키보드 입력 받기 위한 객체 생성

		ArrayList<Integer> scores = new ArrayList<>(); // 동적배열을 선언
		int score;
		while (true) {
			System.out.print("학생의 점수를 입력하세요. 더 이상 입력할 학생의 점수가 없으면 -1 을 입력하세요. ");
			score = in.nextInt();
			if (score == -1) {
				break;
			}
			scores.add(score);
		}
		System.out.println(scores.size());

		int total = 0;
//		for (int i = 0; i < scores.size(); i++) {
//			total += scores.get(i);
//		}
		for (Integer sc : scores) {
			total += sc;
		}

		System.out.printf("%d 학생의 점수 총합은 %d 이고, 평균은 %.1f 입니다.", scores.size(), total, total / (double) scores.size());

	}

}
