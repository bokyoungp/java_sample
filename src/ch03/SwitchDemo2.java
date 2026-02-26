package ch03;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String res = howMany(1);
		System.out.println(res);
	}

	public static String howMany(int n) {
		if (n == 1)
			return "1 개";
		else if (n == 2)
			return "2 개";
		else
			return null;
	}

}
