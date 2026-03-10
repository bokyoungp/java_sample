package exercise.ch08;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
//		Dice dice = ;

		System.out.println(new Dice().roll());

	}

}

class Dice {

	int roll() {
		Random random = new Random();
		return random.nextInt(1, 7);
	}
}
