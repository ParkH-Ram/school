package _class;

class  Check {
	 //instanceVariable : iv
	 //classVariable : cv
	 // instanceMethod: im
	// classMathod : cm
	
	static int cv = 5;  // Ŭ���� ����
	int iv = 4 ;    // �ν��Ͻ� ����
	
	static void cm () { // Ŭ���� �޼���
		
	}
	void im() {	//�ν��Ͻ� �޼��� 
		
	}
	static void cm_Imember() {
		
		//Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
		// System.out.println(iv); // ���� �߻�
		// im(); // ���� �߻�
	}
	void im_Cmember() {
		//�ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmember() {
		//Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
	//�ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
	System.out.println(iv);
	im();
	}
	
	
}

public class class5_method2 {

	
	
	public static void main (String[] args) {
		Check.cm_Imember(); // ����Ұ� Ŭ���� ������� �ν��Ͻ� ����� ����
		Check.cm_Cmember();   // Ŭ���� ����� Ŭ���� ����� ����
		
		Check myinstance = new Check();
		myinstance.im_Cmember();   // �ν��Ͻ� ����� Ŭ���� ����� ����
		myinstance.im_Imember();   // �ν��Ͻ� ����� �ν��Ͻ� ����� ����
		
		
	}
}
