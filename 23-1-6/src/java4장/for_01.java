package java4��;

public class for_01 {

	public static void main(String[]args) {
//		int i,
//		j = 0;
//		
//		for(i=1; i<=10; i++) {   // 1 ~ 10���� ���� ���ϴ� 
//			j += i;
//			System.out.println(j);
//		}
		
//		// ������ ���� ���� ���� ����.
//	 for (float x= 0.1f; x <= 1.0f; x +=0.1f) {  
//		 System.out.println(x);
		
		
		
		// ������ 
		int i,j;
//		
//		for(i=2; i<10; i++) {
//			System.out.println(i+"��");
//			for (j=1; j<10; j++) {
//				System.out.println(i + "x" + j +"="  + (i*j)   );
//			
//			}
//		}
		
		//while ������ ���
		i=2;
		while(i<10) {
			System.out.println(i+"��");
			j=1;

			while(j<10) {
				System.out.println(i + "x" + j +"="  + (i*j)   );
				j++;
			}
			i++;
		}
		
		int sum=0;
		int sumi=1;
	
		while(sumi<=100) {
			sum += sumi;
			sumi++;
		}
		System.out.println(sum + " " + (sumi-1));
		
	}

}
