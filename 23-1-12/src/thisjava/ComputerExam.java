package thisjava;

public class ComputerExam {
	
	public static void main(String[]args) {
		int r =10;
		
		Calculator cal = new Calculator();   //��ü�� �ϳ� �������ְ�  // �θ� Ŭ�������� ��ü ����
		System.out.println("�� ���� : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("�� ���� : " + com.areaCircle(r));
		
		
	}

}
