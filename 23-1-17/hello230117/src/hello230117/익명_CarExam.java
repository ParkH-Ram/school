package hello230117;

public class �͸�_CarExam {

	public static void main(String[] args) {
		�͸�_Car car = new �͸�_Car();
		
		
		//�͸� �ڽ� ��ü�� ���Ե� �ʵ� ���
		car.run1();
		
		//�͸� �ڽ� ��ü�� ���Ե� ���� Ŭ����
		car.run2();
		
		//�͸� �ڽ� ��ü�� ���Ե� �Ű����� ���
		
		car.run3(new �͸�_Tire(){       //�͸� �ڽ� ��ü
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� ��ü 3�� ��������"); 
		}
	});

	}
}
