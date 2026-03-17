package data_structure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		System.out.println(list.size());

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);

		System.out.println(list);

		System.out.println(list.get(0));

		System.out.println(list.remove() + "가 삭제되었습니다.");

		System.out.println(list);
		list.remove(); // 맨 앞의 항목을 지우는 것으로 removeFirst() 와 동일한 기능

		System.out.println(list);
		list.remove();

		System.out.println(list);

		System.out.println(list.isEmpty());

	}

}
