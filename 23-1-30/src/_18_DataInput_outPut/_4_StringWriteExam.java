package _18_DataInput_outPut;

import java.io.FileWriter;
import java.io.Writer;

public class _4_StringWriteExam {
	public static void main(String[]args) {
		try { 
			//���� ��� ��� ��Ʈ�� ����
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			//1 ���ھ� ��� 
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char �迭 ���
			char[]arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//���ڿ� ���
			writer.write("EFG");
			
			writer.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
