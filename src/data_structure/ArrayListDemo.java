package data_structure;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		list.remove(3);

		System.out.println(list);

		System.out.println(list.get(list.size() - 1));
		System.out.println("현재 동적 배열의 크기는 " + list.size());

		list.forEach(System.out::println);
		System.out.println(list.isEmpty());
	}

}
