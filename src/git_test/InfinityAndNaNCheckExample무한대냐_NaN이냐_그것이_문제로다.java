package git_test;

public class InfinityAndNaNCheckExample���Ѵ��_NaN�̳�_�װ���_�����δ� {

	public static void main(String[]args) {
		int x =5;
		double y = 0.0;
		double z = x / y;
	//	double z = x % y;
		
		System.out.println(z + 2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) 
			System.out.println("�� ���� �Ұ�");
		else System.out.println(z + 2);
	
	}
}
