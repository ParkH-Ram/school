package _18_DataInput_outPut;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class _2_WriteExam_PartiallyOutput {

		public static void main(String[]args) {
			try {
				//데이터 도착지를 test1.db 파일로하는 바이트 출력 스트림 생성
				OutputStream os = new FileOutputStream("C:/Temp/test3.db", true);
				byte [] array = {10, 20, 30, 40, 50};			
				
				//배열의 모든 바이트 출력
				os.write(array, 1, 3);
				
				//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
				//os.flush(); // 생략가
				//출력 스트림을 닫아 사용한 메모리 해제
				os.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	


}
