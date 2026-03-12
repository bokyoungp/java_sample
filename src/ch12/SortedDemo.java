package ch12;

import java.util.Comparator;

public class SortedDemo {

	public static void main(String[] args) {
		System.out.print("국가 이름 순서 : ");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)) // Comparator 람다식,
																				// Comparator.comparing(비교기준)
				// , Comparator.comparing(비교기준).reversed()
				.forEach(Util::printWithParenthesis);

		System.out.print("\n국가 이름 순서 (역순): ");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName).reversed())
				.forEach(Util::printWithParenthesis);

		System.out.print("\n국가 GDP 순서 : ");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank).reversed())
				.forEach(Util::printWithParenthesis);

//		// 메서드 참조를 사용하지 않고 작성하면 왜 오류가 나고 메서드 참조에서는 왜 오류가 나지 않을까?
		Nation.nations.stream().sorted(Comparator.comparing((Nation n) -> n.getGdpRank()).reversed())
				.forEach(Util::printWithParenthesis);

		System.out.print("\n국가 인수 순서(인구가 많은 나라부터 출력) : ");
		Nation.nations.stream().sorted(Comparator.comparing((Nation n) -> n.getPopulation()).reversed())
				.forEach(Util::printWithParenthesis);
	}

}
