package ch09;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(3.14);
		list.add("abc");
		list.add("Circle");

		Object i = list.get(0);
		if (i instanceof Integer ii) {
			System.out.println(ii + 10);
		}
		i = list.get(1);
		Integer i3 = (Integer) i;
		System.out.println(i3 + 10);

		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(10);
		int i4 = intArr.get(0);
		// intArr.add(3.14);

		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("abc");
		String s = strArr.get(0);
		// strArr.add(10);
	}

}
