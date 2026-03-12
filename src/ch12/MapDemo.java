package ch12;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MapDemo {

	public static void main(String[] args) {
		String[] sa = { "a", "b", "c", "d", "e" };

		Arrays.stream(sa) // Stream<String>
				.map(String::toUpperCase) // 인스턴스 메서드 참조
				.forEach(Util::print); // static 메서드 참조

		System.out.println();

		Integer[] ia = { 1, 2, 3, 4, 5 };
		Arrays.stream(ia).map(i -> i * 2).forEach(Util::print);

		String[] sa1 = { "a1", "b1", "c2", "d3", "e4" };
		// 1. 각 원소의 두번째 글자만 잘라내서 스트림으로 반환한다.
		// 2. 문자열을 숫자로 변환해서 숫자 스트림으로 반환한다.
		// 3. 숫자 스트림을 다시 문자열 스트림으로 반환한다. "s" + 1
		// 4. 출력한다.

		System.out.println();
		Arrays.stream(sa1).map(s -> s.substring(1)).mapToInt(Integer::parseInt)
				// 여기에 3번 추가
				.mapToObj(i -> "s" + i).forEach(Util::print);

		// Nation 의 인구만을 값으로 가지는 DoubleStream 으로 변환하기
		OptionalDouble o = Nation.nations.stream().mapToDouble(n -> n.getPopulation()).max();

		if (o.isPresent())
			System.out.println(o.getAsDouble());

	}

}
