package thisjava;

public class Driver {
	
	public static void main(String[]args) {
		
		Undergraduate_�������л� under1 = new Undergraduate_�������л�();
		
		under1.setName("����");
		under1.setNumber(15881588);
		under1.setClubName("����� �ƴմϴ�");
		
		System.out.println(under1.toString());
		
		Undergraduate_�������л� under2 = new Undergraduate_�������л� ("����", 5999534, "����Դϱ�?");
		
		System.out.println(under2.toString());  // ���� ���� �޼ҵ� 
		
		if (under1.equals(under2)) {
			System.out.println("������");
		}else {
			System.out.println("�޶���");
		}
		
	
		
		
	}

}
