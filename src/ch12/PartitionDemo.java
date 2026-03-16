package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionDemo {

	public static void main(String[] args) {
		Stream<Nation> nations = Nation.nations.stream().limit(4);

		Map<Boolean, List<Nation>> p = nations.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));
		System.out.println(p);

		nations = Nation.nations.stream().limit(4);
		Map<Boolean, Long> p1 = nations
				.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND, Collectors.counting()));

		System.out.println(p1);

	}

}
