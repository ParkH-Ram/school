package _18_DataInput_outPut;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class _2_WriteExam_AutoResourcesClose {
	public static void main(String[]args) {
		//������ �� finally ó�� Ȯ��
		
		
		//�ڵ� ���ҽ� �ݱ�?
		try(OutputStream os=new FileOutputStream("C:/Temp/test1.db", true)) { //true ���� ����, false �����
		//������ �������� test1.db ���Ϸ��ϴ� ����Ʈ ��� ��Ʈ�� ����
		
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
		
			//1byte�� ���
			os.write(a);  // os�ȿ� byte a �� �ۼ��ϰڴ�.
			os.write(b);
			os.write(c);
			
		//���� ���ۿ� �ܷ��ϴ� ����Ʈ�� ����ϰ� ���۸� ���
		os.flush();

	
		}catch(Exception e) {
			e.printStackTrace();

//	}
		
		}
	}
}
	//������ �� finally ó�� Ȯ��
//		OutputStream os=null;
//		try {
//			//������ �������� test1.db ���Ϸ��ϴ� ����Ʈ ��� ��Ʈ�� ����
//			os = new FileOutputStream("C:/Temp/test1.db");
//			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;
//			
//			//1byte�� ���
//			os.write(a);  // os�ȿ� byte a �� �ۼ��ϰڴ�.
//			os.write(b);
//			os.write(c);
//			
//			//���� ���ۿ� �ܷ��ϴ� ����Ʈ�� ����ϰ� ���۸� ���
//			os.flush();
//
//	
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//		//��� ��Ʈ���� �ݾ� ����� �޸� ����
//		try {
//			os.close();
//		} catch (IOException e) {}
//		}
//	}


