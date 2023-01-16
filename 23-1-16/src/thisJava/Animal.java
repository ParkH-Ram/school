package thisJava;

public abstract class Animal {    //추상 클래스 선언

	public void breath() {    // 일반 메서드
		System.out.println("숨");
	}
	public abstract void sound();
}
