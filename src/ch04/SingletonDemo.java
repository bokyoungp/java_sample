package ch04;

public class SingletonDemo {

	public static void main(String[] args) {
		// Singleton s = new Singleton();

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1 == s2);

	}

}
