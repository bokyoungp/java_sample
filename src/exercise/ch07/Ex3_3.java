package exercise.ch07;

import java.util.Arrays;

public class Ex3_3 {

	public static void main(String[] args) {
		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println("정렬 전 : " + Arrays.toString(books));
		Arrays.sort(books);
		System.out.println("정렬 후 : " + Arrays.toString(books));

	}

}

class Book implements Comparable {
	// 변수
	int price;

	// 생성자
	public Book(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Book book) {
			return this.price - book.price;
		}
		return -999999;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}

}
