package _18_DataInput_outPut;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class _3_ReadJpg_Exam {
	public static void main(String[]args) {
		try {
			String originalFileName = "C:/Temp/test4.jpg";
			String targetFileName = "C:/Temp/test5.jpg";
			
			InputStream is = new FileInputStream(originalFileName);
			OutputStream os = new FileOutputStream(targetFileName);
			
			byte[] data = new byte[1024];   //파일을 1메가 정도 읽어가지고 저장이 되게 설정을 하게 되고요 
											//크기에 대한 부분은 개발자가 조정
			
			while (true) {
				int num = is.read(data);  // 파일 읽기
				if(num == -1) break;
				
				os.write(data, 0, num); //파일 쓰기
			
		
				}
			os.close();
			is.close();
			
			System.out.println("복사 굿");
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
