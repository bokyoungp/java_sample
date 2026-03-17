package data_structure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();

		System.out.println(list.size());

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);

		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(1));

		System.out.println(list.remove() + "가 삭제되었습니다.");

		System.out.println(list);
		list.remove(); // 맨 앞의 항목을 지우는 것으로 removeFirst() 와 동일한 기능

		System.out.println(list);
		list.remove();

		System.out.println(list);
//
//		System.out.println(list.isEmpty());

	}

}
