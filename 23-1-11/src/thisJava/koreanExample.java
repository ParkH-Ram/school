package thisJava;

public class koreanExample {
	
	public static void main(String[]args) {
		
		korean k1 = new korean ("123456-1234567", "���ڹ�");
		
		System.out.println(k1.nation + " " + k1.ssn + " " + k1.name);
		
		
		//final �ʵ忡�� �� ���� �Ұ�
//		k1.nation =  "USA";
//		k1.ssn = "123-123-13";
		
		// �ν��Ͻ� ����� �� ������ ����
		k1.name = "���ڹ�";
		System.out.println(k1.name);
	}
	

}
