package thisjava;


// Ŭ���� ��� --   �θ� Ŭ����
class Person{
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("�Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}

// Ŭ���� �л� --   �ڽ� Ŭ����


class Student2 extends Person{
	void learn() {
		System.out.println("����");
	}
}

// Ŭ���� ����  --  �ڽ�

class Teacher extends Person {
	void teach() {
		System.out.println("����ġ��");
	}
	
	@Override
	void say() {
		System.out.println("���ϱ�2");
	}
	
}

public class ���Ŭ���� {
	
	public static void main(String[]args) {
		Student2 s1 = new Student2();     // �л� ��ü s1 ����
		s1.breath();
		s1.learn();
		Teacher t1 = new Teacher(); 
		t1.breath();
		t1.teach();
		
	}

}
