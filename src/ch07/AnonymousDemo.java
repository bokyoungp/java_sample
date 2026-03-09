package ch07;

public class AnonymousDemo {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			@Override
			void method1() {
				System.out.println("한번만 만들어져서 불리는 이름없는 클래스입니다.");
			}
		};
		parent.method1();

		ParentInterface pi = new ParentInterface() {

			@Override
			public void method2() {
				System.out.println("부모 인터페이스를 구현한 자식 클래스입니다.");

			}
		};
		pi.method2();
	}

}

class Parent {
	void method1() {
		System.out.println("부모클래스입니다.");
	}
}

//class OnlyOnce extends Parent {
//	
//}

interface ParentInterface {
	void method2();
}

//class Once implements ParentInterface {
//
//	@Override
//	public void method2() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
