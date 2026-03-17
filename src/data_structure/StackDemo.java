package data_structure;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.peek());

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " 이 제거되었습니다.");
		}

//		AStack<Integer> astack = new AStack<>();
//		astack.push(10);
//		astack.push(20);
//		astack.push(30);
//
//		System.out.println(astack.peek());
//
//		while (!astack.isEmpty()) {
//			System.out.println(astack.pop() + " 이 제거되었습니다.");
//		}
		System.out.println("List로 구현한 stack 의 동작");

		LStack<Integer> lstack = new LStack<>();
		lstack.push(10);
		lstack.push(20);
		lstack.push(30);

		System.out.println(lstack.peek());

		while (!lstack.isEmpty()) {
			System.out.println(lstack.pop() + " 이 제거되었습니다.");
		}

	}

}
