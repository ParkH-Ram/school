import java.text.DecimalFormat;

public class System_MeasureRunTimeExam_소수점_출력방법 {
	public  static void main(String[]args) {
		DecimalFormat df = new DecimalFormat("###,###");
		long time1 = System.nanoTime();
		int sum = 0;	
		for (int i=1; i<7777778; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		long hi = (time2 - time1);
		String sum1 = df.format(sum);    // 숫자에 콤마 붙이기
		String sum2 = df.format(hi);
		
		
		
		System.out.println("1~7777778 " + sum1);
		System.out.println("걸린시간 " +sum2 + "(ns)");
	}

}
