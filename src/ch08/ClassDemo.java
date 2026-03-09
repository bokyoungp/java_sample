package ch08;

public class ClassDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitec", "L001", 10000);

		Class c = k.getClass();

		System.out.println(c.getName());
		System.out.println(c.getSimpleName());

	}

}
