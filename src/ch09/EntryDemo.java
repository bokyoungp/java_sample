package ch09;

public class EntryDemo {

	public static void main(String[] args) {
		Entry<String, Integer> e = new Entry<>("김선달", 20);
		String name = e.getKey();
		int age = e.getValue();
		System.out.println(name + " : " + age);

		Entry<String, String> e1 = new Entry<>("김선달", "20");

		Entry<Integer, Integer> e2 = new Entry<>(20, 20);

		Entry e3 = new Entry("a", "b");

	}

}

class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
