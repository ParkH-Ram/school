package java4장;

public class for_01 {

	public static void main(String[]args) {
//		int i,
//		j = 0;
//		
//		for(i=1; i<=10; i++) {   // 1 ~ 10까지 전부 더하는 
//			j += i;
//			System.out.println(j);
//		}
		
//		// 정말한 계산시 에는 쓰지 말것.
//	 for (float x= 0.1f; x <= 1.0f; x +=0.1f) {  
//		 System.out.println(x);
		
		
		
		// 구구단 
		int i,j;
//		
//		for(i=2; i<10; i++) {
//			System.out.println(i+"단");
//			for (j=1; j<10; j++) {
//				System.out.println(i + "x" + j +"="  + (i*j)   );
//			
//			}
//		}
		
		//while 구구단 방법
		i=2;
		while(i<10) {
			System.out.println(i+"단");
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
