package ch02;

public class HeapAreaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello"; // 'h' 'e' 'l' 'l' 'o'
		Object obj = new Object(); // 1. 4바이트 확보 2. 힙영역에 Object 객체 생성 3. 주소를 1번에 확보한 변수에 할당
		Object obj2 = new Object(); // 1. 4바이트 확보 2. 힙영역에 Object 객체 생성 3. 주소를 1번에 확보한 변수에 할당
		int value = 3; // 1. 4바이트 확보 2. 3이라는 값을 1번에 확보한 변수에 할당
		// String str = new String("hello"); // 1. 4바이트 확보 2. 힙영역에 String 객체 생성("hello")
		// 3. 주소를 1번에 확보한 변수에 할당

		System.out.println(str); // 0x100
		System.out.println(obj); // 0x200
		System.out.println(obj2); // 0x300
	}

}
