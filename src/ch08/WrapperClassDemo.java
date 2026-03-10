package ch08;

public class WrapperClassDemo {

	public static void main(String[] args) {
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i);

		Integer iI = 10; // 포장,박싱을 자동으로 해줌
		int j = iI; // 언박싱을 자동으로 해줌.
		System.out.println(iI);
//		 Integer.valueOf(s);

	}

}
