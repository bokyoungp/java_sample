package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 3, "바나나", 5, "딸기", 1);

		System.out.println(map.get("사과"));
		System.out.println(map.size());

		System.out.println(map.containsKey("망고"));

		HashMap<String, Integer> hash = new HashMap<>(map);
		hash.put("망고", 10); // 키가 없는 경우에는 새로운 항목을 추가
		System.out.println(hash);

		hash.put("망고", 4); // 키가 존재하는 경우에는 항목의 값을 수정
		System.out.println(hash);

		hash.remove("망고");
		System.out.println(hash);

		hash.forEach((k, v) -> System.out.println(k + ":" + v));

		Set<String> keySet = hash.keySet();
		System.out.println(keySet);

		Collection<Integer> values = hash.values();
		values.forEach(System.out::println);

		Set<Map.Entry<String, Integer>> entrySet = hash.entrySet();
		System.out.println(entrySet);

		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key + " : " + value);
		}
	}

}
