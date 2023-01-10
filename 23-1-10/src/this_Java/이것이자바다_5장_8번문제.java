package this_Java;

public class 이것이자바다_5장_8번문제 {
	
	public static void main(String[]args) {
		int sum =0;
		int count=0;
		int [][] arr = {
				{95, 86},
				{88, 99, 44},
				{80, 90, 50}
		};
		
		for(int i=0; i<arr.length; i++) {
		
			for(int j=0; j<arr[i].length; j++) {
			 sum += arr[i][j];
			 count++;
			 
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);		
	}
	
}
