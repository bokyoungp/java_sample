package ch03;

public class SwitchDemo {

	public static void main(String[] args) {
		// switch 문
		String yoil = "토";

		switch (yoil) {

		case "월", "화", "수", "목", "금" -> System.out.println("평일입니다.");
		case "토", "일" -> System.out.println("주말입니다.");

		}

		String result = switch (yoil) {

		case "월", "화", "수", "목", "금" -> "평일입니다.";
		case "토", "일" -> "주말입니다.";
		default -> "유효하지 않은 요일입니다.";
		};

		System.out.println(result);

		String obj = "참새";
		String kind = switch (obj) {
		case "호랑이", "사자":
			yield "포유류";
		default:
			yield "...";
		};
		System.out.println(kind);

	}

}
