package ch12;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 2, 3, 5, 7, 11, 13 };
		IntStream is = Arrays.stream(ia);
		System.out.println(is.summaryStatistics());

		String[] sa = { "The", "pen", "is", "mighter", "than", "the", "sword" };
		Stream<String> ss = Arrays.stream(sa);
	}

}
