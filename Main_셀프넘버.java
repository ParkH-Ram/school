package ����;

public class Main_�����ѹ� {

	public static void main(String[] args) {
		
		int[]i = new int [10001];   // �迭 ���� ����
		int h4;          // õ�ڸ� 
		int h3;			// ���ڸ�
		int h2;			// ���ڸ�
		int h1;			// 
		int tmp=0;		// �ӽú���
		for (int j=0; j<10000; j++) {
			h4 = j/1000; 
			tmp=j%1000;
			h3 = tmp/100;
			tmp=tmp%100;
			h2 = tmp/10;
			h1 = tmp%10;
			tmp = j+h1+h2+h3+h4; //  ���ǰ� �����ڰ� �ִ� �ѹ� ���� ��� 
			//tmp�� �����ڰ� j
			// �׷� tmp�� �����ѹ��� �ƴ� �� 
			// ���� �����ڰ� ���� ���ľ�� ���� �� �� ���� ���� �����ѹ� 
			if(tmp<10000) // ������ ������ 10000�� �Ѿ�� 
				i[tmp] = 1;  // 1�� �ʱ�ȭ 
		
	
		}
		for (int j=0; j<10000; j++) {
			if(i[j]!=1) {
				System.out.println(j);
			}
		}


	}

}
