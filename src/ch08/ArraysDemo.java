package ch08;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		//
		String[] arr = { "j", "a", "v", "a" };
		String[] arr2 = { "j", "a", "v", "a" };

		System.out.println(Arrays.equals(arr, arr2));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.equals(arr, arr2));

		String[] arr1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arr1));

		int index = Arrays.binarySearch(arr, "j");
		System.out.println(index);
	}

}
