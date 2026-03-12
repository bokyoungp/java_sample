package exercise.ch12;

import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		// 주어진 점수리스트를 이용하여, 점수를 10점씩 상향조정하여 결과를 출력하라.
		List<Integer> scores = List.of(45, 76, 38, 27, 50);
		Stream<Integer> s1 = scores.stream();
		s1.map(n -> n + 10).forEach(System.out::println);

	}

}
