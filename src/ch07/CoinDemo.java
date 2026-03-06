package ch07;

public class CoinDemo {

	public static void main(String[] args) {
		System.out.println("Dime 은 " + Coin.DIME + " 센트입니다.");
		// Coin coin = new Coin(); // X

	}

}

interface Coin {
	public static final int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}