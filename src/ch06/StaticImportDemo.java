package ch06;

//static method import 하고 클래스 명 생략하고 메서드 이름만으로 호출해서 사용가능함
import static java.util.Arrays.sort;

import java.util.Arrays;

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = { 3, 5, 2, 7 };

		System.out.println(Arrays.toString(data));
		sort(data);
		System.out.println(Arrays.toString(data));

		double[] datas = { 1.0, 0.1, 0.7 };
		sort(datas);
		System.out.println(Arrays.toString(datas));
	}

}
