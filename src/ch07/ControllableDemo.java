package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
//		예를 들어, 전자제품에  포함되어야 하는 제어부의 요구 조건
//		모든 전자제품에는 전원을 온·오프하는 기능이 있으며, 수리 및 공장 초기화를 할 수 있다.
//		전자제품 객체는 turnOn( ) 메서드, turnOff( ) 메서드로만 전원을 조절할 수 있어야 한다.
//		수리 및 공장 초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다.
//		수리 기능은 자식 클래스에서 오버라이딩할 수도 있다.
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();

		tv.remoteOn();
		tv.remoteOff();

		Controllable.reset1();

		Notebook nb = new Notebook();
		nb.turnOn();
		nb.turnOff();
		nb.repair();
		nb.inMyBag();
	}

}

interface Controllable {
	void turnOn();

	void turnOff();

	default void repair() {
		System.out.println("장비를 수리한다.");
	}

//	private void reset() {
//		
//	}

	static void reset1() {

	}
}

interface RemoteControllable extends Controllable {
	void remoteOn();

	void remoteOff();
}

class TV implements RemoteControllable { // Controllable 을 상속받았기 때문에 RemoteControllable 만 구현해도 됨.

	@Override
	public void turnOn() {
		System.out.println("TV를 켜다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끄다.");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("TV 를 수리한다.");
	}

	@Override
	public void remoteOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 리모콘으로 켜다.");
	}

	@Override
	public void remoteOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 리모콘으로 끄다.");
	}

}

class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켜다.");

	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끄다.");

	}

}

interface Portable {
	void inMyBag();
}

class Notebook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("노트북은 내 가방안에 있다.");

	}

}
