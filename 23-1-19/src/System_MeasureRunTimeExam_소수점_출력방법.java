import java.text.DecimalFormat;

public class System_MeasureRunTimeExam_�Ҽ���_��¹�� {
	public  static void main(String[]args) {
		DecimalFormat df = new DecimalFormat("###,###");
		long time1 = System.nanoTime();
		int sum = 0;	
		for (int i=1; i<7777778; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		long hi = (time2 - time1);
		String sum1 = df.format(sum);    // ���ڿ� �޸� ���̱�
		String sum2 = df.format(hi);
		
		
		
		System.out.println("1~7777778 " + sum1);
		System.out.println("�ɸ��ð� " +sum2 + "(ns)");
	}

}
