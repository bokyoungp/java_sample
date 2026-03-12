package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 2, 3, 5, 7, 11, 13 };
		IntStream is = Arrays.stream(ia);
		is.summaryStatistics();
		is = Arrays.stream(ia);
		is.sum();
		is = Arrays.stream(ia);
		is.average();
//		IntSummaryStatistics stats = is.summaryStatistics();
//		System.out.println(stats);
//		is = Arrays.stream(ia);
//		System.out.println(stats.getAverage() + "," + stats.getSum());

		Stream<Integer> is1 = Stream.of(2, 3, 5, 7, 11, 13);
		IntStream is2 = IntStream.of(2, 3, 5, 7, 11, 13);
		is2.sum();

		String[] sa = { "The", "pen", "is", "mighter", "than", "the", "sword" };
		Stream<String> ss = Arrays.stream(sa);
		// System.out.println(ss.average() + ss.sum());

		IntStream is3 = IntStream.iterate(100, i -> i * 2);

		IntStream is4 = new Random().ints(0, 100);

		Stream<Double> ds = Stream.generate(Math::random);

		IntStream is5 = IntStream.rangeClosed(1, 10);

	}

}
