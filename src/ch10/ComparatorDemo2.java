package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(3, 7);

		Car[] cars = list.toArray(new Car[4]);

		System.out.println(Arrays.toString(cars));

		Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);

		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> ageComparator = Comparator.comparing(Car::getAge);

		Arrays.sort(cars, ageComparator);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> mileageComparator = Comparator.comparing(Car::getMileage);

		// 오름차순 정렬
		Arrays.sort(cars, mileageComparator);
		System.out.println(Arrays.toString(cars));

		// 내림차순 정렬
		Arrays.sort(cars, mileageComparator.reversed());
		System.out.println(Arrays.toString(cars));

		String[] strs = { "c", "a", "b" };
		Arrays.sort(strs, Comparator.reverseOrder()); // , Comparator.reverseOrder());
		System.out.println(Arrays.toString(strs));
	}

}
