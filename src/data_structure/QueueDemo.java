package data_structure;

public class QueueDemo {

	public static void main(String[] args) {
		LQueue<Integer> q = new LQueue<>();

		System.out.println(q.isEmpty());

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.println(q.peek());

		while (!q.isEmpty()) {
			System.out.println(q.poll() + " 가 큐에서 제거되었습니다.");
		}

	}

}
