package _18_DataInput_Output;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class _9_PrintStreamExam {
	public static void main(String[]args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("�͵� �̰Ž� ���ô簡?");
		ps.println("�����Ͱ� ����ϴ� ��ó���̶� ī�� ���� �̰Ž� Ű����� �Է��� �޴� ���� ���̴簡?");
		ps.println("����� �غ��ڰ�");
		ps.printf("%6d | %-10s | %10s | \n", 1, "���ÿ�?", "���� ģ����");
		
		ps.close();
		
	}

}
