package ch10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo4 {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("runnable 구현체입니다.");
		r.run();

		Consumer<String> c = t -> System.out.println(t + " Consumer의 구현체입니다.");
		c.accept("hello");

		Supplier<String> s = () -> "Hello";
		System.out.println(s.get());

		Function<String, Integer> f = t -> t.length();
		System.out.println(f.apply("hello"));

	}

}

//@FunctionalInterface
// public interface Runnable {
//    public abstract void run();
// }

// 
// @FunctionalInterface
//public interface Consumer<T> {
//void accept(T t);
//default Consumer<T> andThen(Consumer<? super T> after) {
//	Objects.requireNonNull(after);
//	return (T t) -> { accept(t); after.accept(t); };
//}
// }

// @FunctionalInterface
// public interface Supplier<T>{
// T get();
// }

//@FunctionalInterface
//public interface Function<T, R> {
//    R apply(T t);
//}