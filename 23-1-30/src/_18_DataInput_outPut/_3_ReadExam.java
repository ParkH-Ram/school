package _18_DataInput_outPut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _3_ReadExam {
	public static void main(String[]args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			byte[] data = new byte[100];    //최대 100byte 크기로 읽어 들이게 설정 ( 배열 100개 생성 )
			
			
			//test2.db 파일안에 3개 밖에 없으므로 3개 값만 출력
			while (true) {
				int num = is.read(data);
				if(num == -1) break;
				
				
				//읽은 바이트를 출력
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
				System.out.println(data[0]);
				System.out.println(data[3]);
			}
			//배열의 모든 바이트를 출력
			is.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
