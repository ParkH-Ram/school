package thisjava;

class Check {
	static int cv = 5;  //  ���� ���� ���
	int  iv = 4;          // �ν��Ͻ� ����


	static void cm() {  //���� �޼ҵ� 
	}
	
	void im() {        //�ν��Ͻ� �޼ҵ�
	}
	
//	static void cm_Imember() {		 // ���� ��� �޼ҵ忡�� �ν��Ͻ� ��� ���
//		System.out.println(iv); 	// ����  : �ν��Ͻ� ��� (���� : ��ü����)
//		im();						// ���� :  �ν��Ͻ� ��� (���� : ��ü ����)
//	}
	void im_Cmember() {				//�ν��Ͻ� �޼ҵ� ���� Ŭ���� ���� ���
		System.out.println(cv);
		cm();
	}
	static void cm_Cmember() {
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		System.out.println(iv);
		im();
	}
	
	
}
public class Method3 {
	public static void main(String[]args) {
		Check check = new Check();
		check.im_Cmember();
		check.im_Imember();
	}

}
