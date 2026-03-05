package ch05;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 정적배열을 이용해서 정해진 학생 수의 점수를 입력받아보자.
		Scanner in = new Scanner(System.in);
		System.out.print("학생 몇 명의 점수를 입력할까요 ? ");
		int numOfStudents = in.nextInt();

		int[] scores = new int[numOfStudents];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생의 점수 > ");
			scores[i] = in.nextInt();
		}

		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}

		System.out.printf("%d 학생의 점수 총합은 %d 이고, 평균은 %.1f 입니다.", numOfStudents, total, total / (double) numOfStudents);

	}

}
