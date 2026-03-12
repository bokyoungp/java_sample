package exercise.ch12;

import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		// 프로그램의 실행 결과는 ?
		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);
	}

}
