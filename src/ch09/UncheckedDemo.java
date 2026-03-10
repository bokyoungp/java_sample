package ch09;

public class UncheckedDemo {

	public static void main(String[] args) {
		int n = 3;
		int m = 1;
		String s = "";

		try {
			System.out.println(s.length());
			int res = n / m;
			System.out.println(res);
			unchecked();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없거나, 배열의 인덱스 범위를 벗어났습니다");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}

	public static void unchecked() throws ArrayIndexOutOfBoundsException {
		int[] arr = { 1, 2, 3 };

		System.out.println(arr[2]);
	}

}
