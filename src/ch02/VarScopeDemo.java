package ch02;

public class VarScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;

		if (true) {
			int var2 = 20;
			System.out.println("var1 : " + var1);
			System.out.println("var2 : " + var2);
			// System.out.println("var3 : " + var3);
		}

		for (int i = 0; i < 1; i++) {
			int var3 = 30;
			System.out.println("var1 : " + var1);
			// ystem.out.println("var2 : " + var2);
			System.out.println("var3 : " + var3);
		}

		System.out.println("var1 : " + var1);
//		System.out.println("var2 : " + var2);
//		System.out.println("var3 : " + var3);

	}

}
