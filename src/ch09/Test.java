package ch09;

public class Test {

	public static void main(String[] args) {
		print(3, "pi");
		print(3.14, 3);
		print("pi", 3.14);
	}

	static <X, Y> void print(X x, Y y) {
		System.out.println(x + ":" + y);
	}

}
