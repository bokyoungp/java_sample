package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + 1);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}
			}

		});

		long start = System.currentTimeMillis();

		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);

		// t.start();
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
