package ch09;

public class CheckedDemo {

	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("체크드 익셉션이 발생했습니다.");
		}
		System.out.println("체크드 익셉션이 발생하지 않고 프로그램이 종료되었습니다.");

	}

}
