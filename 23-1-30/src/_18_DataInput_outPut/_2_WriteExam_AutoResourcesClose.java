package _18_DataInput_outPut;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class _2_WriteExam_AutoResourcesClose {
	public static void main(String[]args) {
		//마지막 에 finally 처리 확인
		
		
		//자동 리소스 닫기?
		try(OutputStream os=new FileOutputStream("C:/Temp/test1.db", true)) { //true 새로 생성, false 덮어쓰기
		//데이터 도착지를 test1.db 파일로하는 바이트 출력 스트림 생성
		
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
		
			//1byte씩 출력
			os.write(a);  // os안에 byte a 를 작성하겠다.
			os.write(b);
			os.write(c);
			
		//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
		os.flush();

	
		}catch(Exception e) {
			e.printStackTrace();

//	}
		
		}
	}
}
	//마지막 에 finally 처리 확인
//		OutputStream os=null;
//		try {
//			//데이터 도착지를 test1.db 파일로하는 바이트 출력 스트림 생성
//			os = new FileOutputStream("C:/Temp/test1.db");
//			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;
//			
//			//1byte씩 출력
//			os.write(a);  // os안에 byte a 를 작성하겠다.
//			os.write(b);
//			os.write(c);
//			
//			//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
//			os.flush();
//
//	
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//		//출력 스트림을 닫아 사용한 메모리 해제
//		try {
//			os.close();
//		} catch (IOException e) {}
//		}
//	}


