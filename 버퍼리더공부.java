package 공부;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class 버퍼리더공부 {

	public static void main(String[]args) throws Exception {
		Scanner hi = new Scanner(System.in);
		try {
			//버퍼가 없는 스트림 생성
		String origninalFilePath1 = 버퍼리더공부.class.getResource("originalFile.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis1 = new FileInputStream(origninalFilePath1);
		FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

		//버퍼가 있는는 스트림 생성
		String origninalFilePath2 = 버퍼리더공부.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
	
		FileInputStream fis2 = new FileInputStream(origninalFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);

		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//복사 시간 측정
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 미사용:\t" + bufferTime + " ns");
		
		fis1.close();
		fos1.close();
		bis.close();
		bos.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	} 
	
	
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		//카피 작업을 하겠다는 이야기조 
		//카피는 한쪽에서 읽고 다른 쪽에서 쓰게
		
		while (true) {
			int data = is.read();    // 배열이 안 주어 졌으니 한 바이트 읽음
			if(data == -1) break;
			os.write(data);    // 한바이트 쓰고 한바이트 읽고
			
		}
		os.flush();    // 라이트를 다 읽고 플러쉬를 해라 
		
		
		long end = System.nanoTime();
		return (end-start);
	}
	
}
