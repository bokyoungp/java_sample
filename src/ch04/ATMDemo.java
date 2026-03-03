package ch04;

public class ATMDemo {

	public static void main(String[] args) {
		ATM atm = new ATM();

		System.out.println(atm.location);
		System.out.println(atm.managedBy);

		atm.identifies();
	}

}
