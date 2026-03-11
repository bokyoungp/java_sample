package ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "d", "c");
		System.out.println(list);

		Collections.sort(list); // 오름차순으로 정렬

		System.out.println(list);

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		}); // 내림차순으로 정렬, Comparator FI 의 구현체인 람다를 활용

		System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.compareTo(o2)); // 오름차순으로 정렬, Comparator FI 의 구현체인 람다를 활용
		System.out.println(list);
	}
}
