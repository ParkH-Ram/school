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
		write("문자 변환 스트림 사용");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		
		//FileOutputStream에 OutputStreamWriter을 이용해서 문자출력
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//OutputStreamWriter 보조스트림을 이용해서 문자 출력
		writer.write(str);
		writer.close();
	}
	
	public static String read() throws Exception{
		
		//FileInputStream에 InputStreamReader 보조 스트림을 연결
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		
		//InputStreamReader 보조 스트림을 이용해서 문자 입력
		char[]data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
		
	}
}
