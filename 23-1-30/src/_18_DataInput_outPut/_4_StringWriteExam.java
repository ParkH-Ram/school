package _18_DataInput_outPut;

import java.io.FileWriter;
import java.io.Writer;

public class _4_StringWriteExam {
	public static void main(String[]args) {
		try { 
			//문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			//1 문자씩 출력 
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[]arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("EFG");
			
			writer.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
