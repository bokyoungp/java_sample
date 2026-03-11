package ch10;

import java.util.function.Consumer;

public class MethodRefDemo {

	public static void main(String[] args) {
		// Mathematical m = d -> Math.abs(d);
		Mathematical m = Math::abs; // static 메서드 참조
		System.out.println(m.calculate(-10.0));

		// Pickable p = (s, i) -> s.charAt(i);
		Pickable p = String::charAt; // 인스턴스 메서드 참조
		System.out.println(p.pick("hello", 0));

		Utils utils = new Utils();
		System.out.println(utils.add(10, 20));

		// Computable c = (i1, i2) -> utils.add(i1, i2);
		Computable c = utils::add; // 인스턴스 메서드 참조
		System.out.println(c.compute(10, 20));

		// Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c1 = System.out::println;

		// NewObject<String> s1 = x -> new String(x);
		NewObject<String> s1 = String::new; // 생성자 참조
	}

}

@FunctionalInterface
interface Mathematical {
	double calculate(double d);
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface NewObject<T> {
	T getObject(T o);
}
