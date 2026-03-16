package ch14;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t = new MyThread();
		long start = System.currentTimeMillis();

		t.start();
		// t.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("hello " + (i + 1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("인터럽트가 발생했습니다.");
			}
		}
	}

}
