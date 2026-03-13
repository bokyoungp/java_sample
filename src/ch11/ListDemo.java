package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// 1) new ArrayList<>() ==> 원소 삽입/삭제 Set 사용해서 원소 수정 , CRUD (Create, Read,
		// Update, Delete)
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.get(0);
		list1.set(0, 20);
		list1.remove(0);

		// 2) Arrays.asList() ==> 원소 삽입/삭제 Set 사용해서 원소 수정 , CRUD (Create, Read, Update,
		// Delete)

		List<Integer> list2 = Arrays.asList(1, 2, 3);

		// list2.add(10);
		// list2.remove(2);
		System.out.println(list2.get(0));
		list2.set(0, 10);
		System.out.println(list2.get(0));

		// 3) List.of() ==> 원소 삽입/삭제 Set 사용해서 원소 수정 , CRUD (Create, Read, Update,
		// Delete)

		List<Integer> list3 = List.of(1, 2, 3);
		// list3.add(10);
		// list3.remove(0);
		// list3.set(0, 10);
		System.out.println(list3.get(0));

		// 불변객체를 이용해서 가변객체 ArrayList 를 만드는 방법
		List<Integer> list4 = new ArrayList<Integer>(list3);
		list4.add(10);
		list4.get(0);
		list4.set(0, 20);
		list4.remove(0);

		// 가변객체(CRUD) ArrayList 를 크기가 고정된 Array 로 다시 변환하는 방법
		Integer[] integers = list4.toArray(new Integer[3]);
		System.out.println(integers[0]);
		integers[0] = 10;
	}

}
