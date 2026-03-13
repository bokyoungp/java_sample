package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();

		map.put(k1, v1);
		map.put(k1, v2);
		map.put(null, 3);

		System.out.println(map.size());

		System.out.println(map);
	}

}

class Fruit {
	String name;
	// 생성자

	// 관련 메서드(hashcode, equals, toString)
}