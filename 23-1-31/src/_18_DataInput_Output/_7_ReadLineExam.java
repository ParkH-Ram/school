package _18_DataInput_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class _7_ReadLineExam {
	public static void main(String[]args) throws Exception{
		
		//FileReader�� BufferReader ���� ��Ʈ�� ����
		
		//                          ������Ʈ������ ��� ( new ���ν�Ʈ�� ) 
		BufferedReader br = new BufferedReader(new FileReader("C:\\java\\23-1-31\\src\\_18_DataInput_Output\\_6_ReadLineExam.java"));
		//�������ô� 2�� �׳� �����ô� 1��    -> \\ 2��,  / 1��;
		
		//�긦 ���� ó�� ����ȭ ����
//		Reader Fr  = new FileReader("C:\\java\\23-1-31\\src\\_18_DataInput_Output\\_6_ReadLineExam.java");
//		BufferedReader br2 = new BufferedReader(Fr);
//		
		
//		//FileOutputStream�� OutputStreamWriter�� �̿��ؼ� �������
//		OutputStream os = new FileOutputStream("C:/Temp/test.txt");    << ���⼭ 
//		Writer writer = new OutputStreamWriter(os, "UTF-8");
//		//OutputStreamWriter ������Ʈ���� �̿��ؼ� ���� ���
		
		
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); // 1���� ����
			if(str == null)break;
			System.out.println(lineNo + " \t" + str);
			lineNo++;
		}
		//BufferReader�� ������ ����� FileReader�� ����
		br.close();
		
	}
}
