package 이브가뭐임;

public class while100까지더하기 {
	
	public static void main(String[]args) {
		int i=1;
		int sum=0;
		while(i <= 100) {
			sum+=i;       // sum = sum+i  // sum = 0+1 ~ 100
			i++;
		}
		System.out.print(sum);
	}

}
