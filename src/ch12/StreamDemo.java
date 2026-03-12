package ch12;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 비어있는 리스트

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		List<Integer> ge5list = new ArrayList<Integer>(); // 비어있는 리스트
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 5) {
				ge5list.add(list.get(i));
			}
		}

		List<Integer> evenlist = new ArrayList<Integer>(); // 비어있는 리스트
		for (int i = 0; i < ge5list.size(); i++) {
			if (ge5list.get(i) % 2 == 0) {
				evenlist.add(ge5list.get(i));
			}
		}

		System.out.println(evenlist);

		list.stream().filter(i -> i >= 5).filter(i -> i % 2 == 0).forEach(System.out::println);
	}

}
