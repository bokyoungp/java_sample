package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
		// 람다 => 익명클래스로 만든 익명객체(메서드)
		Object o = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		// o.max(10, 20);

		FuncInterface f = new FuncInterface() {

			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a : b;
			}
		};

		System.out.println(f.max(10, 20));
		System.out.println(f.max(10, 5));

		FuncInterface f1 = (a, b) -> a > b ? a : b;

		System.out.println(f1.max(10, 20));
		System.out.println(f1.max(10, 5));

	}

}

// 함수형 인터페이스 - 추상메서드 단 하나만을 가지는 인터페이스
@FunctionalInterface
interface FuncInterface {
	int max(int a, int b);
}
