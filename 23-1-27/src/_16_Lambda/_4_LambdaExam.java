package _16_Lambda;

import java.util.Scanner;

public class _4_LambdaExam {

	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		int s = hi.nextInt();
		int p = hi.nextInt();
		_4_Person per = new _4_Person(); // double, double �� �μ��� �޴�  
		
		//���๮�� �ΰ��� ���
		per.action((a, b) ->{     //���� ����
			int result = a + b;
			return result;		// ��������� �Ű�����
		}, s, p);  //  s, p �� �Ű� ���� 
		
		//���Ϲ��� �ϳ��� ���� ��� �����
		
		//�׼� �ż��� �ȿ� ��� println�� �����ϹǷ� main ���� ���� �ۼ����� �ʾƵ� ��� ��
		per.action((x, y) -> (x + y), hi.nextInt(), hi.nextInt());   //�ϳ��� ���� ���� return ���� ����    
		
		per.action((x,y) -> sum(x, y), hi.nextInt(), hi.nextInt()); // �ᱹ�� �μ� �Է� ���� �μ� �ΰ��� action(x, y)�� ����
	}
	public static int sum(int x, int y) {
		return (x +(- y));
	}

}
