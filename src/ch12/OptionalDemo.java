package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String s = "hello";
		Optional<String> opt = Optional.ofNullable(s);
		System.out.println(opt);

		if (opt.isPresent())
			System.out.println(opt.get());

		String s1 = null;
		Optional<String> opt1 = Optional.ofNullable(s1);
		System.out.println(opt1);
		if (opt1.isEmpty())
			System.out.println("널 값을 포함하고 있습니다.");

	}

}
