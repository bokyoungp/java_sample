package ch07;

public class ControllbleDemo2 {

	public static void main(String[] args) {
		Controllable[] controllables = { new TV(), new Computer(), new Notebook() };

		for (Controllable controllable : controllables) {
			controllable.turnOn();
			controllable.turnOff();
			controllable.repair();
		}
		Controllable.reset1();
	}

}
