package ch10;

import java.util.ArrayList;

public class LambdaDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for (Integer integer : list) {
			System.out.println(integer);
		}

		list.forEach(i -> System.out.println(i)); // Consumer 의 구현체,람다식 ==> 매개변수가 있고, 반환타입이 없는 람다식
		list.removeIf(i -> i % 2 == 0); // Predicate 의 구현체, 람다식
		list.forEach(i -> System.out.println(i)); // Consumer 의 구현체,람다식
		list.replaceAll(i -> i * 10); // UnaryOperator 의 구현체, 람다식
		list.forEach(i -> System.out.println(i));
	}

}
