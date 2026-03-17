package data_structure;

public class SLinkedList<E> {
	private Node<E> head;
	private int size;

	public SLinkedList() {
		head = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	private class Node<E> {
		E item;
		Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}

	}

	void addFirst(E item) {
		// 1단계 : 새로운 노드를 생성한 후 node의 값을 설정한다음
		// 새로 생성된 노드가 맨 앞으로 가도록 한다.
		// < === 1) 여기를 구현한다.
		Node<E> newNode = new Node<>(item, head);
		// 2단계 : 현재 데이터가 없는 경우, 즉 빈 리스트인 경우
		// head 와 tail 모두 newNode 가 되도록 처리한다.
		// 리스트에 데이터가 있을 경우에는 head 만 새로 추가된 노드로 변경해준다.
		// < === 2) 여기를 구현한다.
		if (size == 0) {
			tail = newNode;
		}
		head = newNode;
		// 3단계
		// 데이터가 하나 추가되었기 때문에 리스트의 사이즈를 하나 증가시킨다.
		// < === 3) 여기를 구현한다.
		size++;
	}

	E remove() { // removeFirst()
		Node<E> removedNode = head;
		head = head.next;
		removedNode.next = null;
		if (size == 1) {
			head = tail = null;
		}
		size--;
		return removedNode.item;
	}

	E removeFirst() {
		return remove();
	}

	@Override
	public String toString() {
		String list = "[";
		for (Node<E> n = head; n != null; n = n.next) {
			if (n.next != null) {
				list += n.item + ",";
			} else {
				list += n.item;
			}
		}
		;
		return "SLinkedList" + list + "]";
	}

}
