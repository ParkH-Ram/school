package hello230119;

import java.io.IOException;

public class System_InExam {
	public static void main(String[]args) throws IOException {
		int speed =0;
		int keyCode =0;
		
		while(true) {
			
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {		// ���� 1Ű
					speed++;
				}else if(keyCode ==50) { // ���� 2 Ű//
					speed--;
				}else if(keyCode==51) {  //���� 3Ű
					break;
				}
				System.out.println("-----------------------");
				System.out.println("1.���� | 2. ���� | 3. ����");
				System.out.println("-----------------------");
				System.out.println("���� �ӵ� = " + speed);
				System.out.print("����: ");
			}
			
			//Ű�� �ϳ��� ����
			keyCode = System.in.read();
		}
		System.out.println("����");
	}

}
