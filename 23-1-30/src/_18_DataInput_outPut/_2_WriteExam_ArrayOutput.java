package _18_DataInput_outPut;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class _2_WriteExam_ArrayOutput {
	public static void main(String[]args) {
		try {
			//������ �������� test1.db ���Ϸ��ϴ� ����Ʈ ��� ��Ʈ�� ����
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			byte [] array = {10, 20, 30};			
			
			//�迭�� ��� ����Ʈ ���
			os.write(array);
			
			//���� ���ۿ� �ܷ��ϴ� ����Ʈ�� ����ϰ� ���۸� ���
			os.flush();
			//��� ��Ʈ���� �ݾ� ����� �޸� ����
			os.close();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
