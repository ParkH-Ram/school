package hello230117;

public class �͸�_Car {
	
	private �͸�_Tire tire1 = new �͸�_Tire();
	
	//�ʵ忡 �͸� �ڽ� ��ü ����
	private �͸�_Tire tire2 = new �͸�_Tire() {
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� Tire ��ü 1�� ����");
		};    // �͸� ��ü�� �߰�ȣ �ڿ��ٰ� �����ݷ��� �ٿ� �����
	};
	
	//tire1�� tire2(�͸��ڽİ�ü) ��ü���� roll()�޼��� ����
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// ���� ������ �͸� �ڽ� ����
		�͸�_Tire tire = new �͸�_Tire() {
		
		@Override
		public void roll(){
			System.out.println("�͸� �ڽ�  2�� ��������");
		}
	};
	tire.roll();

}

	public void run3(�͸�_Tire tire) {
		tire.roll();
	}

}
	
