package _class;

class Area{                //������ ���ϴ� Ŭ����
	static void manual() {  //Ŭ���� �޼���� �ٷ� ��� ����.
		//static Ŭ���� �޼��� : void �� ���� ���� ����. 
		System.out.println("������ ������ �Լ� ���");
		System.out.println("triangle : �ﰢ���� ����");
		System.out.println("rectangle : �簢���� ����");
		System.out.println("�Դϴ�");
	}
	//�޼��带 �ϳ� ����Կ�
	double triangle(int a, int b) {   //�ﰢ�� ���� ����
						//�ν��Ͻ� �޼��� (static�� ���� ������)
		return (double)a*b / 2;   //void�� ���� ������ ���� �� ǥ��
	}							//�ٷ� ��� �Ұ�. ( �ҷ���� �� )
 	int rectangle(int a, int b) {  // �簢���� ����
 		return a * b;
 		
 	}
}


public class class5_method1 {
	
	
	
	
	public static void main (String[] args) {
		
		Area.manual(); // Ŭ���� �޼���
		//Area.triagle(3, 5) ;    // �ν��Ͻ� �޼��� ���� �Ұ��� <- �ν��Ͻ� ������
		//Area.rectagle(3, 5) ;    // �ν��Ͻ� �޼��� ���� �Ұ��� <- �ν��Ͻ� ������		
		
		Area cal = new Area();    // �ν��Ͻ� cal ����
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 5));
	}

}
