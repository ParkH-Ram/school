package _18_DataInput_outPut;

import java.io.FileInputStream;
import java.io.InputStream;

public class _2_InputTest {

		public static void main(String[]args) {
			int count=0;
			try {
				//데이터 도착지를 test1.db 파일로하는 바이트 출력 스트림 생성
				InputStream os = new FileInputStream("C:/Temp/test3.db");
				//byte [] array = {10, 20, 30, 40, 50};			
				
				//배열의 모든 바이트 출력
				while(true) {
					int a = os.read();
					
					if(a==-1) break;
					count++;
					System.out.println(a);
				}
				System.out.println(count);
				//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
				//os.flush(); // 생략가
				//출력 스트림을 닫아 사용한 메모리 해제
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
