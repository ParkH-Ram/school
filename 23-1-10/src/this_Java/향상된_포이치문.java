package this_Java;

public class ����_����ġ�� {
	
	public static void main(String[]args) {
		int [] score = {95, 88, 44, 99, 22};
		int sum=0;
		
		
		
		for (int i : score) {
			sum += i;
		}
		double avg = sum /score.length; 
		System.out.println(sum);
		System.out.println(avg);
				
	}

}
