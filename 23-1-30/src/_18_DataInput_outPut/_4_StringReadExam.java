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
			
			//1 문자씩 읽기
			reader = new FileReader("C:/Temp/test.txt");    //텍스트 파일로부터 문자 입력 스트림 생성
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];  // 읽은 문자를 저장할 배열 생성
			while(true) {
				int num =reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) System.out.print(data[i]); // 읽은 문자를 수만큼 출력
			}
			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
	
		}
	}

}
