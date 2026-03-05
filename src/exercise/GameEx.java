package exercise;

import java.util.Arrays;

public class GameEx {

	public static void main(String[] args) {
		// 힌트 : Math.random() 을 활용
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		int index;
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * 3);
			// System.out.println(index);
			System.out.println(name[index]);
		}

	}

}
