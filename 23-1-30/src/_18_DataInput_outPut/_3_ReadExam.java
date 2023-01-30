package _18_DataInput_outPut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _3_ReadExam {
	public static void main(String[]args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			byte[] data = new byte[100];    //�ִ� 100byte ũ��� �о� ���̰� ���� ( �迭 100�� ���� )
			
			
			//test2.db ���Ͼȿ� 3�� �ۿ� �����Ƿ� 3�� ���� ���
			while (true) {
				int num = is.read(data);
				if(num == -1) break;
				
				
				//���� ����Ʈ�� ���
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
				System.out.println(data[0]);
				System.out.println(data[3]);
			}
			//�迭�� ��� ����Ʈ�� ���
			is.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
