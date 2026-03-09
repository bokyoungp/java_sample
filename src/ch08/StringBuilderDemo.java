package ch08;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode());

		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());
		sb.append("!!!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.replace(0, 2, "hello");
		System.out.println(sb);

		long before = System.nanoTime();
		String result = "";
		for (int i = 0; i < 10000; i++) {
			result += i;
		}
		long after = System.nanoTime();
		System.out.println(after - before);

		before = System.nanoTime();
		StringBuilder sb1 = new StringBuilder("");
		for (int i = 0; i < 10000; i++) {
			sb1.append(i);
		}
		String res = sb1.toString();
		after = System.nanoTime();
		System.out.println(after - before);

	}

}
