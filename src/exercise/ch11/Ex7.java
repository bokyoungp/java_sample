package exercise.ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = "";
		String minName = "";
		int maxScore = 0;
		int minScore = 100;
		int totalScore = 0;
		double mean = 0.0;

		Set<Map.Entry<String, Integer>> entrys = map.entrySet();

		for (Map.Entry<String, Integer> entry : entrys) {
			totalScore += entry.getValue();

			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				maxName = entry.getKey();
			}

			if (entry.getValue() < minScore) {
				minScore = entry.getValue();
				minName = entry.getKey();
			}
		}
		// 평균점수, 최고점수와 최저점수를 받은 아이디 출력
		System.out.printf("평균 점수 %.2f\n", totalScore / (double) map.size());
		System.out.println("최고점수 아이디 " + maxName);
		System.out.println("최저점수 아이디 " + minName);

	}

}
