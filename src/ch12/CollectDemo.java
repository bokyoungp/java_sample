package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		Stream<Nation> nations = Nation.nations.stream();

		List<String> nationNames = nations.map(n -> n.getName()).limit(3).collect(Collectors.toList());

		System.out.println(nationNames);

		nations = Nation.nations.stream();

		Map<String, Double> nationsIsland = nations.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));

		System.out.println(nationsIsland);
	}

}
