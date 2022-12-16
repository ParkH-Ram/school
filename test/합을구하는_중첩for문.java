package test;

public interface 합을구하는_중첩for문 {

	public static void main(String[]args) {
		
		int sum = 0 ;
		
		for (int j=1; j<=10; j++) {
			// j 가 1 
			// i
			
			for(int i=0; i<=j; i++) {
				//i가 j 증가 값이 변경 될 때 계속 sum에 중첩해줌. ㅋ  이해 ㅇㅋ 
				
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}

}
