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
			
			byte[] data = new byte[1024];   //������ 1�ް� ���� �о���� ������ �ǰ� ������ �ϰ� �ǰ�� 
											//ũ�⿡ ���� �κ��� �����ڰ� ����
			
			while (true) {
				int num = is.read(data);  // ���� �б�
				if(num == -1) break;
				
				os.write(data, 0, num); //���� ����
			
		
				}
			os.close();
			is.close();
			
			System.out.println("���� ��");
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
