package ch03;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// 시험점수를 입력을 받아서 해당 점수가 A, B, C, F 인지 학점을 출력해주는 프로그램을 작성하라.
		// A : 90~100, B:80~89, C:70~79, F:0~69, 0~100 범위를 벗어나는 점수가 들어오면 유효하지 않은 점수가
		// 입력되었습니다.

		Scanner in = new Scanner(System.in);
		System.out.println("시험 점수를 입력해 주세요");
		int score = in.nextInt();
		String grade = "";
		if (score > 100 || score < 0) {
			grade = "유효하지 않은 점수가 입력됨";
		} else if (90 <= score) { // nested if 문 - 중첩 if
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else {
			grade = "F";
		}

		System.out.printf("당신의 점수는 %d 이며, 학점은 %s 입니다.", score, grade);
	}

}
