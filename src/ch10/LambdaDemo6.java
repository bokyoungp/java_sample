package ch10;

public class LambdaDemo6 {

	public static void main(String[] args) {
		String s = "hello";

		UseThis u = (s1) -> { // 외부 지역변수를 람다식 변수로 선언하는 것은 안됨.
			s = s + ", java"; // 외부 지역변수를 참조할 수는 있지만 람다식 내부에서 지역변수의 값을 변경할 수 없음
			System.out.println(s1 + s + " useThis 람다식 구현체입니다.");
		};
		u.use("hi");

	}

}

@FunctionalInterface
interface UseThis {
	void use(String s);
}
