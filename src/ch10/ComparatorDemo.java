package ch10;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "hello", "abc", "b" };

		Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

		System.out.println(Arrays.toString(arr));
	}

}
