package test;

public class 합을구하는_while {

	    public static void main(String[] args) {
	        int i=0;
	        int sum = 0;
	        int sum_sum = 0;
	        
	        while(i<=10) {
	            sum = sum+i;
	            sum_sum = sum_sum+sum;
	            i++;
	            System.out.println(sum_sum + "\t" + sum + "\t" + i);   
	        }
	        System.out.println(sum_sum);    
	    }
	


}
