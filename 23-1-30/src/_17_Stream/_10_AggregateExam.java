package _17_Stream;

import java.util.Arrays;
import java.util.Scanner;

public class _10_AggregateExam {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		
		//���� �迭
		int[] arr = new int [hi.nextInt()];
		for (int i=0; i<arr.length; i++) {
			arr[i] = hi.nextInt();
			
		}
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i]<min) min = arr[i];
		}
		System.out.println("�ּҰ��� : " + min );
		
		//ī���� 
		long count = Arrays.stream(arr).filter(n-> n%2==0).count();
		System.out.println("2�� ����� ���� : " + count);

		//����
		long sum = Arrays.stream(arr).filter(n-> n%2==0).sum();
		System.out.println("2�� ����� ���� : " + sum);
		
		//���
		double avg = Arrays.stream(arr).filter(n-> n%2==0).average().getAsDouble();
		// average�� �ٲ� �� long type�� Double ������ ����ϱ� ����
		
		System.out.println("2�� ��� ��� : " + avg);
		
		//�ִ�
		int max = Arrays.stream(arr).filter(n-> n%1==0).max().getAsInt();
		// average�� �ٲ� �� long type�� Integer���¸� Int�� ��ȯ �� ����ϱ� ���� getAsInt() ���
		
		System.out.println("��ü �� �ִ� : " + max);

		//�ּڰ�
		int mins = Arrays.stream(arr).min().getAsInt();
		//average�� �ٲ� �� long type�� Integer���¸� Int�� ��ȯ �� ����ϱ� ���� getAsInt() ���
		
		System.out.println("��ü �� �ּڰ� : " + mins);
		
		
	}

}
