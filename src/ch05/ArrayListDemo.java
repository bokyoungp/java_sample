package ch05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");

		System.out.println(al);

		al.remove(1);
//		al.remove("C");

		System.out.println(al);

	}

}
