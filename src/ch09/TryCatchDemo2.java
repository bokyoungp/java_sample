package ch09;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		Reso r = new Reso();
		Reso r1 = new Reso();

		try (r; r1) {
			r.open();
			r1.open();
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}

	}

}

class Reso implements AutoCloseable {
	void open() {
		System.out.println("자원을 엽니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("자원을 닫습니다.");

	}

}
