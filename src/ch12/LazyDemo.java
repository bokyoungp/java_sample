package ch12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);

		// 1. 스트림을 만든다.
		// 2. 중간연산 - 1) 짝수만 걸러낸다.
		// 2) 제곱한 값을 반환한다.
		// 3. 최종연산 - 내용을 출력한다.
		is.filter(i -> {
			System.out.println("filter : " + i);
			return i % 2 == 0;
		}).map(i -> {
			System.out.println("map : " + i);
			return i * i;
		}).forEach(i -> System.out.println("forEach : " + i));

		IntStream is3 = IntStream.iterate(100, i -> i * 2);
		// is3.forEach(System.out::println);

		IntStream is4 = new Random().ints(0, 100);
		// is4.forEach(System.out::println);

		Stream<Double> ds = Stream.generate(Math::random);
		ds.limit(10).forEach(System.out::println);
	}

}
