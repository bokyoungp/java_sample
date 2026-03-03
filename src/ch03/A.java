package ch03;

public class A {

	public static void main(String[] args) {
		MyMath math = new MyMath();
		System.out.println(math.add(10, 20));
		System.out.println(math.add(10, 20, 30));

		System.out.println(math.add(10L, 20L));
		System.out.println(math.add(10L, 20L, 30L));

		System.out.println(math.add(10, 20, 30, 40));

		System.out.println(math.sub(10, 20));

	}

}

class MyMath {
	long add(long a, long b) { // Method overloading , 단, 리턴 타입은 시그니처에 영향을 주지 않는다.
		return a + b;
	}

//	int add(long a, long b) { // Method overloading , 단, 리턴 타입은 시그니처에 영향을 주지 않는다.
//		return a + b;
//	}
//	
	long add(long a, long b, long c) {
		return a + b + c;
	}

	long add(int a, int b) {
		return a + b;
	}

	long add(int a, int b, int c) {
		return a + b + c;
	}

	long add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	long sub(long a, long b) {
		return a - b;
	}

}