package ch09;

public class GenericDemo {

	public static void main(String[] args) {
		Cup<Beer> cup = new Cup<>();

		cup.setBeverage(new Beer());
		Beer beverage = cup.getBeverage();
		beverage.drink();

		Cup<Boricha> cup2 = new Cup<>();
		cup2.setBeverage(new Boricha());
		Boricha beverage2 = cup2.getBeverage();
		beverage2.drink();
//
//		cup.setBeverage(new Circle());
//		Object circle = cup.getBeverage();
	}

}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}

}

class Beverage {
	void drink() {
		System.out.println("음료수를 마신다.");
	}
}

class Boricha extends Beverage {
	@Override
	void drink() {
		// TODO Auto-generated method stub
		System.out.println("보리차를 마신다.");
	}
}

class Beer extends Beverage {

	@Override
	void drink() {
		// TODO Auto-generated method stub
		System.out.println("맥주를 마신다.");
	}

}
