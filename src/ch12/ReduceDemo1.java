package ch12;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 {

	public static void main(String[] args) {
		// 리스트에서 GDP가 20위 이내의 나라의 인구 총합을 구하시오.
		Stream<Nation> nations = Nation.nations.stream();
		// Optional reduce
		Optional<Nation> big = nations.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2);
		big.ifPresent(System.out::println);

//		nations = Nation.nations.stream();
//		nations.filter(n -> n.getGdpRank() <= 20)
//		.reduce((d1, d2) -> d1.getPopulation() + d2.getPopulation());

		nations = Nation.nations.stream();
		// T reduce
		double totalPopulation = nations.filter(n -> n.getGdpRank() <= 20).mapToDouble(Nation::getPopulation)
				.reduce(0.0, (d1, d2) -> d1 + d2);

		System.out.println(totalPopulation);

	}

}
