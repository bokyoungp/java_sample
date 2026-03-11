package ch10;

import java.util.function.Predicate;

public class LambdaDemo3 {

	public static void main(String[] args) {
		MyFunction func = () -> System.out.println("익명객체입니다.");

		aMethod(func);
		MyFunction ff = bMethod();
		ff.myMethod();

		Predicate<String> isEmpty = t -> t.length() == 0;
		System.out.println(isEmpty.test(""));

	}

	static void aMethod(MyFunction f) {
		f.myMethod();
	}

	static MyFunction bMethod() {
		return () -> System.out.println("람다식입니다."); // 익명객체를 반환
	}
}

@FunctionalInterface
interface MyFunction {
	void myMethod();
}
