package _18_DataInput_outPut;

import java.io.FileInputStream;
import java.io.InputStream;

public class _2_InputTest {

		public static void main(String[]args) {
			int count=0;
			try {
				//������ �������� test1.db ���Ϸ��ϴ� ����Ʈ ��� ��Ʈ�� ����
				InputStream os = new FileInputStream("C:/Temp/test3.db");
				//byte [] array = {10, 20, 30, 40, 50};			
				
				//�迭�� ��� ����Ʈ ���
				while(true) {
					int a = os.read();
					
					if(a==-1) break;
					count++;
					System.out.println(a);
				}
				System.out.println(count);
				//���� ���ۿ� �ܷ��ϴ� ����Ʈ�� ����ϰ� ���۸� ���
				//os.flush(); // ������
				//��� ��Ʈ���� �ݾ� ����� �޸� ����
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
