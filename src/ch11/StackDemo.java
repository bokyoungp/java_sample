package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// 스택은 인덱스가 1부터 시작이 되고, 1이 가장 위에 존재하는 항목, 1부터 지우고, 새로 추가된 항목의 인덱스가 1이 된다.
		Stack<String> stack = new Stack<>();

		stack.push("A");
		// underflow
		if (!stack.empty()) {
			System.out.println(stack.peek());
			System.out.println(stack.pop());
		}

		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		System.out.println(stack.search("A") + "," + stack.search("B") + ", " + stack.search("C") + ","
				+ stack.search("D") + "," + stack.search("O"));

	}

}
