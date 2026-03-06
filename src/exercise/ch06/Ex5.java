package exercise.ch06;

public class Ex5 {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };
		// 코드 추가
		for (Phone phone : phones) {
//			if (phone instanceof Phone) {
//				phone.talk();
//			} else if (phone instanceof Telephone telephone) {
//				telephone.autoAnswering();
//			} else if (phone instanceof Smartphone smartphone) {
//				smartphone.playGame();
//			}
			if (phone instanceof Smartphone smartphone) {
				smartphone.playGame();
			} else if (phone instanceof Telephone telephone) {
				telephone.autoAnswering();
			} else if (phone instanceof Phone) {
				phone.talk();
			}
		}
	}

}

class Phone {
	protected String owner;

	void talk() {
		System.out.println(owner + "가 통화중");
	}

	public Phone(String owner) {
		this.owner = owner;
	}
}

class Telephone extends Phone {
	private String when;

	void autoAnswering() {
		System.out.println(owner + "가 부재중이니 " + when + "에 전화 요망");
	}

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
}

class Smartphone extends Telephone {
	private String game;

	void playGame() {
		System.out.println(owner + "가 " + game + " 게임 중");
	}

	public Smartphone(String owner, String game) {
		super(owner, "내일");
		this.game = game;
	}
}
