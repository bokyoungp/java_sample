package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();

		map.put(new Fruit("사과"), 5);
		map.put(new Fruit("사과"), 3);

		Fruit f1 = new Fruit("사과");
		Fruit f2 = new Fruit("사과");
		System.out.println(f1.equals(f2));

		map.put(null, 3);

		System.out.println(map.size());

		System.out.println(map);
	}

}

class Fruit {
	String name;
	// 생성자

	public Fruit(String name) {
		this.name = name;
	}

	// 관련 메서드(hashcode, equals, toString)
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj instanceof Fruit fruit) {
			if (this.hashCode() == fruit.hashCode())
				return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit[" + name + "]";
	}

}