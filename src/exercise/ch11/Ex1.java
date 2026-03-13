package exercise.ch11;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		// 1. ArrayList 선언
		List<String> list = new ArrayList<>();
		// 2. add 함수로 '동물' 추가
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		// 3. for-each 문과 if 조건문으로 문자열의 길이가 2인 동물만 출력
		System.out.println("for-each 문과 if 조건문으로 문자열의 길이가 2인 동물만 출력 >>> ");
		for (String animal : list) {
			if (animal.length() == 2) {
				System.out.println(animal);
			}
		}
		// 4. 스트림으로 풀기
		System.out.println("스트림으로 문자열의 길이가 2인 동물만 출력 >>> ");
		list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

	}

}
