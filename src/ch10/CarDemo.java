package ch10;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		// 디젤 자동차만 모두 찾아보자.
		ArrayList<Car> diesel = findCars(Car.cars, c -> !c.isGasoline());
		System.out.println("디젤 자동차 ==> ");
		System.out.println(diesel);
		// 10년보다 오래된 자동차만 모두 찾아보자.
		ArrayList<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
		System.out.println("10년보다 오래된 자동차 ==> ");
		System.out.println(oldCars);
		// 10년보다 오래된 가솔린 자동차만 모두 찾아보자.
		ArrayList<Car> oldGasoline = findCars(Car.cars, c -> (c.getAge() > 10) && (c.isGasoline()));
		System.out.println("10년보다 오래된 가솔린 자동차 ==> ");
		System.out.println(oldGasoline);
	}

	public static ArrayList<Car> findCars(List<Car> cars, CarPredicate cp) {
		ArrayList<Car> result = new ArrayList<Car>();

		for (Car car : cars) {
			if (cp.test(car)) {
				result.add(car);
			}
		}
		return result;
	}

}

interface CarPredicate {
	boolean test(Car car);
}

interface CarConsumer {
	void apply(Car car);
}