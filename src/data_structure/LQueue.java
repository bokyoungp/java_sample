package data_structure;

public class LQueue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;

	public LQueue() {
		front = rear = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private class Node<E> {
		E item;
		Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}

	}

	E peek() {

		return front.item;

	}

	void offer(E item) { // rear 에 새로운 노드 추가
		Node<E> newNode = new Node<>(item, null);
//        newNode.item = item;
//        newNode.next = tail;
		if (size == 0) { // head == tail && head == null
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		size++;
	}

	E poll() { // removeFirst()
		Node<E> removedNode = front; // 지워질 노드를 먼저 저장한다.
		front = front.next; //
		removedNode.next = null;
		if (size == 1) {
			front = rear = null;
		}
		size--;
		return removedNode.item;
	}

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = front; n != null; n = n.next) {
			if (n.next != null) {
				list += n.item + ",";
			} else {
				list += n.item;
			}
		}
		;
		return "Queue" + list + "]";
	}
}
