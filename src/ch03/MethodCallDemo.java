package ch03;

public class MethodCallDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment 메서드 호출 전 x 의 값은 " + x);
		increment(x);
		System.out.println("increment 메서드 호출 후 x 의 값은 " + x);
	}

	public static void increment(int n) { // call by value -- read only
		System.out.println("increment 메서드 시작할 때 n 의 값은 " + n);
		n++;
		System.out.println("increment 메서드 종료할 때 n 의 값은 " + n);
	}

}
