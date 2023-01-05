package git_test;

class Test{ 	
	
	long sum(int[] a) {
		// 그냥 메서드
	
		long sum =0;
	
	for (int i=0; i<a.length; i++) {
		sum += a[i];
	}
		return sum;
	
	}
}

public class starTest{
	public static void main(String[]args) {
	int []a= {5,5,5,5,5,4,4,4,4,4,3,3,3,3,3,34,3,4};
	Test hi = new Test();
	
	System.out.print(hi.sum(a));
	}
	
	
}
