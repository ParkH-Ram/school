package _18_DataInput_outPut;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class _4_StringReadExam {
	public static void main(String[]args) {
		try {
			Reader reader = null;
			
			//1 ���ھ� �б�
			reader = new FileReader("C:/Temp/test.txt");    //�ؽ�Ʈ ���Ϸκ��� ���� �Է� ��Ʈ�� ����
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];  // ���� ���ڸ� ������ �迭 ����
			while(true) {
				int num =reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) System.out.print(data[i]); // ���� ���ڸ� ����ŭ ���
			}
			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
	
		}
	}

}
