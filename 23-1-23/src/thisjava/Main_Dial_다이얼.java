package thisjava;
import java.util.Scanner;


// �˰���
// ���� �Է� �ް�
// �Է� ���� ������ ���̸� �ľ� ��
// �Է� ���� ���� ��ŭ ������ ������
// ����ġ������ ������. ����ġ���� ������ �Է¹��� ���ڸ� ���� ��ŭ �ݺ�
// A-Z ���� case�� �־� �ص� �� �� �� 
// ��� ��.

public class Main_Dial_���̾� {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int sum=0;
		
		String al = hi.nextLine();
		int leng = al.length();

		for(int i=0; i<leng; i++) {
		switch(al.charAt(i)) {  //�Է� ������ �ϳ��� �ɰ���.
		
		case 'A': case 'B': case'C':
			sum = sum+3;
			break;
		case 'D': case 'E': case'F':
			sum = sum+4;
			break;
		case 'G': case 'H': case'I':
			sum = sum+5;
			break;
		case 'J': case 'K': case'L':
			sum = sum+6;
			break;
		case 'M': case 'N': case'O':
			sum = sum+7;
			break;
		case 'P': case 'Q': case'R':case'S':
			sum = sum+8;
			break;
		case 'T': case 'U': case'V':
			sum = sum+9;
			break;
		case 'W': case 'X': case'Y': case'Z':
			sum = sum+10;
			break;
		default:
			break;	
		}
	}
	
	System.out.println(sum);
	hi.close();	
	}

}
