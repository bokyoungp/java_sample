package exercise;

public class DiceDemo {

	public static void main(String[] args) {
		// 힌트 : Math.random() 을 이용할 것
		Dice dice = new Dice();

		// Math.random() 값 확인, 0~1 사이의 실수값,
		// 0, 1, ..., 5 만 출력하도록 ==> 1,2,3,4,5,6
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Math.random() * 6);
//		}

		dice.roll(); // 1 부터 6 사이의 값이 랜덤하게 출력
	}

}

class Dice {
	void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}
}
