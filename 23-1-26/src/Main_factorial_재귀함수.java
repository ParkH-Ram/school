import java.util.Scanner;

public class Main_factorial_����Լ� {
	static int fact1(int num) {
		if(num ==1) return 1;
		if(num ==0) return 1;
		else return num*fact1(num-1); //num == 1 �϶����� �ݺ�
		      // ->  5 �Է½�  5*4 -> num-1 ������ fact1 ȣ�� 
		      // -> 
	}
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int num = hi.nextInt();
		System.out.println(fact1(num));
		hi.close();
	}


}