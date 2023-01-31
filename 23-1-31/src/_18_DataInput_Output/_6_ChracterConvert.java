package _18_DataInput_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _6_ChracterConvert {
	public static void main(String[]args) throws Exception {
		write("���� ��ȯ ��Ʈ�� ���");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		
		//FileOutputStream�� OutputStreamWriter�� �̿��ؼ� �������
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//OutputStreamWriter ������Ʈ���� �̿��ؼ� ���� ���
		writer.write(str);
		writer.close();
	}
	
	public static String read() throws Exception{
		
		//FileInputStream�� InputStreamReader ���� ��Ʈ���� ����
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		
		//InputStreamReader ���� ��Ʈ���� �̿��ؼ� ���� �Է�
		char[]data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
		
	}
}
