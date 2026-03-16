package ch14;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " -> " + (i + 1));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}
			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " -> " + (i + 1));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("인터럽트가 발생했습니다.");
				}
			}

		});

		long start = System.currentTimeMillis();

		t.start();
		t2.start();

//		t.run();
//		t2.run();

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + "hello " + (i + 1));
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
