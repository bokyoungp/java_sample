package ch11;

import java.util.Collection;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
		// SOLID 의 원칙중 DIP (Dependency Inversion Principle) 을 지키지 않은 예
//		 ArrayList<Integer> list = new ArrayList<>();
//		// LinkedList<Integer> list = new LinkedList<>();
//
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addFirst(30);

//		System.out.println(list);

		// SOLID 의 원칙중 DIP (Dependency Inversion Principle) 을 지킨 예
		Collection<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);

	}

}
