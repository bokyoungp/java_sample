package ch03;

public class Ex4 {

	public static void main(String[] args) {
		// 요구사항 - 1부터 10까지의 숫자 중에서 홀수 즉 1,3,5,7,9 만 출력하는 프로그램을 작성해라.
		// 기술적 요구사항 - while 문을 사용해라.
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
