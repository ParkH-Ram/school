package thisjava7��_���;

public class ChildExam {
	
	public static void main(String[]args) {
		
	
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		parent.field2 = "data2";
		parent.method3();
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		
		
		
//		//�ڽ� ��ü ����
//		Child child = new Child();
//	 	
//		//�ڵ�Ÿ�� ��ȯ
//		Parent parent = child;   // �ڽ��� �θ��� ��ȯ  -> �ڵ���ȯ �� �� ������ �Ѱ� �ִ°Ŷ� �θ� ����� �޼��常 ��� ����
//									// ������ �Ѱ� ��µ� �θ� Ÿ���� �ǹ޾��� �� �θ�Ÿ�Կ� ���� ���Ǿ� �ִ� �޼ҵ常 
//									// �������̵� �ѰŴ� �ڽ��� ���� ��� �ǰ�.. �� �� �������� ���� 
//		parent.method1();
		parent.method2();        
//		parent.method3();

	}

}
