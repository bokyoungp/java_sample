package ch14;

import java.util.Random;

public class SynchronizedDemo {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		Thread t1 = new CarThread("A", car, "서울");
		Thread t2 = new CarThread("B", car, "울산");
		Thread t3 = new CarThread("C", car, "대전");
		t1.start();
		t2.start();
		t3.start();
	}

}

class SharedCar {
	public synchronized void drive(String driver, String where) {
		System.out.println(driver + "가 자동차에 탔습니다.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 4); i++) {
			System.out.println(driver + "가 자동차에 운전합니다.");
		}
		System.out.println(driver + "가 " + where + "에 도착했습니다.");
	}
}

class CarThread extends Thread {
	private String driver;
	private SharedCar car;
	private String where;

	public CarThread(String driver, SharedCar car, String where) {
		super();
		this.driver = driver;
		this.car = car;
		this.where = where;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		car.drive(driver, where);
	}

}
