package ch09;

public class GenericMethod { // Outer Class

	// Inner Class, 중첩 클래스
	static class Utils {
		public static <T extends Comparable<T>> void showArrays(T[] a) { // Comparable 을 구현한 클래스만 올 수 있게 제한 ,
			// public static <T extends Comparable<T>> void showArrays(T[] a) { // 숫자 만 T 에
			// 올 수 있게 제한 ,
			for (T i : a) {
				System.out.println(i);
			}
		}

//		public static void showArrays(String[] a) {
//			for (String string : a) {
//				System.out.println(string);
//			}
//		}
//		
//		public static void showArrays(Person[] a) {
//			for (Person person : a) {
//				System.out.println(person);
//			}
//		}
//		
//		public static void showArrays(long[] a) {
//			for (long l : a) {
//				System.out.println(l);
//			}
//		}

	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 };
		String[] arr2 = { "a", "b", "c" };
		Long[] arr3 = { 10L, 20L, 30L };
		Double[] arr4 = { 1.0, 2.0, 3.0 };
		// Person[] arr5 = {new Person()};

		Utils.showArrays(arr1);
		Utils.showArrays(arr2);
		Utils.showArrays(arr3);
		Utils.showArrays(arr4);
		// Utils.showArrays(arr5);

	}

}
