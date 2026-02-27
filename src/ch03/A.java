package ch03;

public class A {

	public static void main(String[] args) {
		MyMath math = new MyMath();
		System.out.println(math.add(10, 20));
		System.out.println(math.sub(10, 20));
	}

}

class MyMath {
	long add(long a, long b) {
		return a + b;
	}

	long sub(long a, long b) {
		return a - b;
	}

}