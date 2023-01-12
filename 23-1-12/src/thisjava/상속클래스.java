package thisjava;


// 클래스 사람 --   부모 클래스
class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

// 클래스 학생 --   자식 클래스


class Student2 extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

// 클래스 선생  --  자식

class Teacher extends Person {
	void teach() {
		System.out.println("가르치기");
	}
	
	@Override
	void say() {
		System.out.println("말하기2");
	}
	
}

public class 상속클래스 {
	
	public static void main(String[]args) {
		Student2 s1 = new Student2();     // 학생 객체 s1 생성
		s1.breath();
		s1.learn();
		Teacher t1 = new Teacher(); 
		t1.breath();
		t1.teach();
		
	}

}
