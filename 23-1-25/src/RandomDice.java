import java.util.Date;
import java.util.Random;

public class RandomDice {
	public static void main(String[]args) {
		double hey;
		Date date = new Date();
		Random ran = new Random(date.getTime());  // �õ尪�� �ٲ���� ������ ������ ���� ������ �޶���
 		
		switch(ran.nextInt(7)) {
		case 1: System.out.println("�ڴ���");
		break;
		case 2: System.out.println("�ڴ�hyun");
		break;
		case 3: System.out.println("�ڴ�����");
		break;
		case 4: System.out.println("�����");
		break;
		case 5: System.out.println("����");
		break;
		case 6: System.out.println("����");
		break;
		case 7: System.out.println("�����");
		break;
		}
		
		
		
	}

}
