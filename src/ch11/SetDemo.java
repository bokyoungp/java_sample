package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = Set.of("사과", "바나나", "수박", "망고");
		HashSet<String> hash = new HashSet<>(set);

		hash.add("오렌지");
		System.out.println(hash);

		hash.add("오렌지");
		System.out.println(hash);

		System.out.println(hash.contains("배"));

		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println(tree.higher("바나나"));
		System.out.println(tree.lower("바나나"));

		System.out.println(tree.lower("사과"));
		System.out.println(tree.higher("사과"));
		System.out.println(tree.higher("수박"));
		System.out.println(tree.lower("수박"));

		System.out.println(tree.first());
		System.out.println(tree.last());

	}

}
