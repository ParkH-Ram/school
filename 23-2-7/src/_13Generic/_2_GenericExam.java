package _13Generic;

public class _2_GenericExam {

	public static void main(String[]args) {
		
		//K�� Tv��ü, M�� String ��ü
		_2_Product<_2_Tv, String> product1 = new _2_Product<>();
		
		//setter �Ű������� �ݵ�� Tv�� String�� ����
		product1.setKind(new _2_Tv());
		product1.setModel("����ƮƼ��");
		
		//getter ���ϰ��� Tv�� String�� ��
		_2_Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K�� Car�� ��ü, M�� String���� ��ü
		_2_Product<_2_Car, String> product2 = new _2_Product<>();
		
		//setter �Ű����� �ݵ�� Car�� String�� ����
		product2.setKind(new _2_Car());
		product2.setModel("SUV�ڵ���");
		
		//getter ���ϰ��� Car�� String�� ��
		_2_Car car = product2.getKind();
		String carModel = product2.getModel();
		
	}
}
