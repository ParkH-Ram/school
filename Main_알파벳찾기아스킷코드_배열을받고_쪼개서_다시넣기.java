package backjun;

import java.util.Scanner;

public class Main_���ĺ�ã��ƽ�Ŷ�ڵ�_�迭���ް�_�ɰ���_�ٽóֱ� {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	String S;     //�Է� ���� ���ڿ�
	int i;        // �ݺ��� ���� 
	int j;
	int[] arrry = new int[26];
	for(int k=0;k<arrry.length;k++) {
		// �ʱⰪ -1�� ���� 
		arrry[k]=-1;
	}
	
	S=hi.nextLine();
	for(i=0; i<S.length(); i++) {
		//���� ��Ʈ���� ������ for�� ����
		j = (int)S.charAt(i)-'a';
		// j�� �ɰ� ���� �־� �� 
		if(arrry[j] == -1)
			// �� ��ȣ�� ���ĺ��� ������ -1�� � ���ڷ� �ٲ��ݾƿ� 
			// -1 �϶��� �ٲ��ְ� �̹� �ٲ� �ִ� ������ ���� �� �ٲ�ȣ
			// ó���� ���� �͸� �ٲٰ� �� ������ �ٲ۰� ���� x
		arrry[j] = i;
		
		
		
//		// j = (����ȯ) S�� �տ��� ����  �ɰ���, 
//		// �ɰ��� �ҹ���a �ƽ�Ű�ڵ� ��ŭ ����  j ��� 
//		System.out.println(j);
	}
	for(int k=0;k<arrry.length;k++) {
	    System.out.print(arrry[k] + " ");
	    //����� �ٽ� ���鼭 �ε����� ���� �� ���� ���
	}
	
	hi.close();
	}
	
}
