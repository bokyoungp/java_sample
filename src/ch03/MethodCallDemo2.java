package ch03;

public class MethodCallDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue();
		System.out.println("메서드 호출 전 ref.x 의 값은 " + ref.x);
		ChangeReference(ref);
		System.out.println("메서드 호출 후 ref.x 의 값은 " + ref.x);

	}

	public static void ChangeReference(RefValue ref) {
		System.out.println("메서드 ---- 시작할 때 ref.x 의 값은 " + ref.x);
		ref.x++;
		System.out.println("메서드 ---- 종료할 때 ref.x 의 값은 " + ref.x);
	}

}

class RefValue {
	int x;
}