package exercise.ch12;

import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// 4개의 문자열을 포함하는 리스트 객체를 스트림으로 생성한 후 문자열 크기가 2인 단어만 출력하는 프로그램을 작성하라.
		List<String> list = List.of("갈매기", "나비", "다람쥐", "라마");
		list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

	}

}
