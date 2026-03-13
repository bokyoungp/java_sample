package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
//		q.remove();
//		q.element();
//		if (!q.isEmpty()) {
		q.peek();
		q.poll();

		q.offer("a");
		q.offer("b");
		q.offer("c");

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

//		}
	}

}
