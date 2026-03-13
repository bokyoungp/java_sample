package ch11;

public class StackDemo2 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
