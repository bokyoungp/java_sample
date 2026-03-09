package exercise.ch08;

public class KeyboardDemo {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard.Builder().name("Logitech").model("K120").price(15000).build();

		Keyboard keyboard1 = new Keyboard.Builder().name("Logitech").model("K130").build();

		System.out.println(keyboard.any);

		System.out.println(keyboard1.price);
	}

}

class Keyboard {

	private String name;
	private String model;
	public String any;
	public int price;

	// private 생성자
	private Keyboard(Builder builder) {
		this.name = builder.name;
		this.model = builder.model;
		this.any = builder.any;
		this.price = builder.price;
	}

	// Builder 클래스
	public static class Builder {
		private String name;
		private String model;
		private String any;
		private int price;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder any(String any) {
			this.any = any;
			return this;
		}

		public Builder price(int price) {
			this.price = price;
			return this;
		}

		public Keyboard build() {
			return new Keyboard(this);
		}
	}
}
