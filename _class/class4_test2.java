package _class;

public class class4_test2 {

		public static void main (String[] args)
	    {
			// ù ��° Employee ��ü ���� ����
	    	
 
	    	// �� ��° Employee ��ü ���� ����
	  			// ���⿡ �ڵ带 �����ϼ���
	    	
			// Employee ��ü�� �����ϰ� emp1�� ����Ű�� �Ѵ�
	    	Employee emp1 = new Employee( );  // Ŭ������ ���� ���� �ش�.

			// emp1�� �̸��� ���̵��ɡ����� �����Ѵ�
			emp1.setName("�̵���");
			//emp1.name="�̵���";
			// emp1�� ��ȣ�� 100���� �����Ѵ�
			emp1.setNumber(100);

			// emp1�� ���̸� 25�� �����Ѵ�
			emp1.setAge(25);

	        // emp1�� �̸�, ��ȣ�� ���̸� ����Ѵ�
			System.out.println(emp1.toString());

			// Employee ��ü�� �����ϰ� emp2�� ����Ű�� �Ѵ�
			Employee emp2 = new Employee( );	
			
			// ���⿡ �ڵ带 �����ϼ���

			// emp2�� �̸��� �������⡯���� �����Ѵ�
			emp2.setName("������");
	  			// ���⿡ �ڵ带 �����ϼ���

			// emp2�� ��ȣ�� 200���� �����Ѵ�
			emp2.setNumber(200);
	  			// ���⿡ �ڵ带 �����ϼ���

			// emp2�� ���̸� 18�� �����Ѵ�
			emp2.setAge(18);
				// ���⿡ �ڵ带 �����ϼ���

			// emp2�� �̸�, ��ȣ�� ���̸� ����Ѵ�
			System.out.println(emp2.toString());
	  			// ���⿡ �ڵ带 �����ϼ���

	        // emp2�� ��ȣ�� 300���� �����Ѵ�
		
			 emp2.setNumber(300);   //set Ŭ������ �ִ� ������  Age�� ������ �� ���
	  			// ���⿡ �ڵ带 �����ϼ���
			 System.out.println(emp2.toString());
			// emp1�� �̸�, ��ȣ�� ���̸� ����Ѵ�
	  			// ���⿡ �ڵ带 �����ϼ���
	    }
	

}
