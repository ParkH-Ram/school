package test;

public class 합을구하는_for1개 {
	
    public static void main(String[] args) {
    	 
        int sum = 0;
        int sum_sum = 0;
        
        for(int j = 1; j <= 10; j++) {
            sum = sum+j;       // 새값이 내려가니 새 값을 더한다.
            sum_sum = sum_sum+sum;    
            // 1 이 10번 2가 9번 ---- 10이1번 더해지는 공식
            // 1 부터 1까지의 합
            // 1 부터 2까지의 합
            // 1부터 3까지의 합
            // --- 1부터 10까지의 합
                    }
        System.out.println("합 " + sum_sum);     
 
    }
}


