package exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();
		int score;
		while (true) {
			System.out.print("학생의 점수를 입력해주세요. 종료하려면 -1 을 입력하세요. > ");
			try {
				score = Integer.parseInt(in.nextLine());
				if (score < 0) {
					break;
				} else {
					System.out.println(score);
					if (score > 100) {
						System.out.println("점수 입력 오류입니다. 다시 입력해주세요.");
					} else {
						scores.add(score);
					}
				}
			} catch (Exception e) {
				System.out.println("입력 오류입니다. 다시 입력해주세요.");
				// in.nextLine();
			}

		}

		if (scores.size() > 0) {
			System.out.println("전체 학생은 " + scores.size() + "명이다.");

			System.out.print("학생들의 성적 : ");
			for (Integer sc : scores) {
				System.out.print(sc + " ");
			}

			int max = Collections.max(scores);
			System.out.println("최고 점수 : " + max);
			String grade = "";
			for (int i = 0; i < scores.size(); i++) {
				if (scores.get(i) >= max - 10 && scores.get(i) <= max) {
					grade = "A";
				} else if (scores.get(i) >= max - 20) {
					grade = "B";
				} else {
					grade = "C";
				}
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "이며 등급은 " + grade + " 입니다.");
			}
		} else {
			System.out.println("입력된 학생의 점수가 없습니다.");
		}

	}

}
