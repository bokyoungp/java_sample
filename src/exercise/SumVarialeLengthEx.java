package exercise;

public class SumVarialeLengthEx {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4)); // 9
		int[] arr = { 2, 3 };
		System.out.println(sum(1, arr)); // 5
		System.out.println(sum(1, 2, 3, 4, 5)); // 14
	}

	static int sum(int i1, int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

}
