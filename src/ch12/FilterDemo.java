package ch12;

import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream.of("a1", "b1", "b2", "c1", "c2", "c3").filter(s -> s.startsWith("c")).skip(1)
				.forEach(System.out::println);

	}

}
