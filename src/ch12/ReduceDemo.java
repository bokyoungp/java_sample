package ch12;

import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 1, 2);

		// Optional reduce
		Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum1.get());

		// T reduce
		int sum2 = numbers.stream().reduce(0, (i1, i2) -> i1 + i2);
		System.out.println(sum2);
	}

}
