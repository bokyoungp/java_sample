package ch06;

public class InheritDemo3 {

	public static void main(String[] args) {
		ColoredBox b = new ColoredBox();

	}

}

class Box {
	public Box() {
		System.out.println("부모 생성자가 호출되었습니다.");
	}

	public Box(String s) {
		System.out.println("부모 생성자가 호출되었습니다.");
	}
}

class ColoredBox extends Box {
//	public ColoredBox(String color) {
//		System.out.println(color + "색 박스가 생성되었습니다.");
//	}
}