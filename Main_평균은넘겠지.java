package backjun;

import java.util.*;

public class Main_������Ѱ��� {

	public static void main(String[]args) {
	
	Scanner hi = new Scanner(System.in);	
		
	int i;      	//n1 for�� ���� ����
	int j;			//n2 for�� ���� ���� 
	int k;			//n2 for�� ���� ����
	int n1;			//���� �Է� �� ( �� �� ���� �� ���� )
	int []n2;       //�ι�° ��� ���� �ľ� �� �� �迭 �ȿ� ���� �־� �ִ� �� ����
	double sum=0;	// n2[index]��  ���� ������ ����
	double avg=0;	// ���� ������ n2.length �� ������ 
	int count=0;	// ����� �Ѵ� �л� üũ�ϱ� ����
	double value;	// ����� �Ѵ� �л��� ���� �� �� �������� ����ϱ� ����
	
	n1 = hi.nextInt();    	// �� ���̴�
	for(i=0; i<n1; i++) { 	// �� ������ �����鼭 �ϳ��ϳ� �Է�
		count=0;			// count �ʱ�ȭ
		sum=0;				// sum �ʱ�ȭ
		value=0;			// value �ʱ�ȭ
		avg=0;				// avg �ʱ�ȭ
		n2 = new int[hi.nextInt()];   	//n2 �ȿ� �� �ε��� ���� �޾��� 
		for(j=0; j<n2.length; j++) {	//n2 ���̷�  j�� ������ 
			n2[j] = hi.nextInt();		//for������ ���� j�� n2 index�� �ݿ�
			sum += n2[j];				// n2[j] ������ ����
		}
		avg = sum/n2.length;			//��� ��� 
		for(k=0; k<n2.length; k++) {	// n2���̷� �ٽ� for���� ������
			if(avg<n2[k]) {				// ���� avg�� n2[�ε���] ���� ������
				count++;  				// count ++
			}
		
		}
		value = count/(double)n2.length;  //  ��� ���� �л��� / �л��� = value
		System.out.printf("%.3f%%\n", Math.round(value*100000f)/1000f);
	}			// %.3f%%\n  �Ҽ���
				// �ۼ�Ʈ �ڿ� ��������� �����µ� �Ҽ��� �ڿ� ���ڸ� ���� / �Ǽ� / 
				// %% �ΰ� ������ ���� �ۼ�Ʈ�� ���  \n �� �� ���� ( ���� ���ٴ� ��  �ٹٲ� ���Ͱ��� �ֵ� ) 
	

	
	
}


}