package ch05;

public class ArrayIncrementDemo {

	public static void main(String[] args) {
		int[] x = { 0, 1, 2 };

		System.out.println("호출전 X[0] = " + x[0]);
		change(x);
		System.out.println("호출후 X[0] = " + x[0]);

	}

	public static void change(int[] a) {
		System.out.println("변경전 a[0] = " + a[0]);
		a[0]++;
		System.out.println("변경후 a[0] = " + a[0]);
	}
}
