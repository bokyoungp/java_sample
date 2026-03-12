package ch12;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {

	public static void main(String[] args) {
		System.out.println(Nation.nations.stream().allMatch(n -> n.getPopulation() > 100.0)); // 모든 국가의 인구가 1억이 넘는지

		Optional<Nation> n = Nation.nations.stream().findFirst();
		n.ifPresent(Util::print);

		Optional<Nation> n1 = Nation.nations.stream().filter(Nation::isIsland).findAny();
		n1.ifPresent(Util::print);

		Stream<Nation> ns = Nation.nations.stream();

		Optional<Nation> on = ns.max(Comparator.comparing(Nation::getPopulation));
		System.out.println("\n인구가 가장 많은 나라 : " + on.get());

		OptionalInt oi = IntStream.of(1, 2, 3, 4, 5).max();
		System.out.println(oi.getAsInt());

		long count = IntStream.of(1, 2, 3, 4, 5).count();
		int sum = IntStream.of(1, 2, 3, 4, 5).sum();

		System.out.println(count + ":" + sum);
	}

}
