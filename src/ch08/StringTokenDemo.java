package ch08;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		String s = "of!the!people,!by!the!people,!for!the!people";
		StringTokenizer st = new StringTokenizer(s, ",");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}

		// st.nextToken();
	}

}
