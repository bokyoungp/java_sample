package ch10;

import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	public Car(String model, boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}

	public static final List<Car> cars = Arrays.asList(new Car("소나타", true, 18, 210000),
			new Car("아반테", true, 10, 70000), new Car("싼타페", false, 1, 10000), new Car("K3", true, 5, 80000),
			new Car("테슬라", false, 1, 10000), new Car("쏘렌토", false, 3, 22000), new Car("그랜저", true, 11, 110000));
}
