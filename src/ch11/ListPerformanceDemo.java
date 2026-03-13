package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();

		// ArrayList 에 10만건의 데이터 추가 , 1) 맨뒤에 항목 추가 2) 맨앞에 항목 추가
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// al.add(i);
			al.add(0, i);
		}
		long start2 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// al.add(i);
			al.remove(0);
		}
		long end = System.nanoTime();

		System.out.println("ArrayList  로 처리한 시간 : " + (end - start2));

		// LinkedList 에 10만건의 데이터 추가, 1) 맨뒤에 항목 추가 2) 맨앞에 항목 추가
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ll.add(i);
			ll.addFirst(i);
		}
		start2 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ll.add(i);
			ll.removeFirst();
		}

		end = System.nanoTime();

		System.out.println("LinkedList 로 처리한 시간 : " + (end - start2));

	}

}
