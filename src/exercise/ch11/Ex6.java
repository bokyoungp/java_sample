package exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {
		Random r = new Random();

		Set<Integer> set = new HashSet<>();
		int number;
		while (set.size() < 6) {
			number = r.nextInt(1, 46);
			set.add(number);
		}

		List<Integer> lotto = new ArrayList<>(set);
		Collections.sort(lotto);
		System.out.println(lotto);

	}

}
