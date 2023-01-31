package _18_DataInput_Output;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _11_FilesExam {
	public static void main(String[]args) {
		try {
			String data = "" + "id: winter\n"+
					"email : winter@mycompany.com\n" +
					"tel : 010 - 123 - 1234" +
					"�ѱ�";
			
			//Path ��ü ����
			Path path  = Paths.get("C:/Temp/user.txt");
			
			//���� ���� �� ������ ����
			//���� ���Ƽ� �� ��
			Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
			
			//���� ���� ���
			System.out.println("���� ����: " + Files.probeContentType(path));
			System.out.println("���� ũ��: " + Files.size(path) + "bytes");
			
			//���� ���Ƽ� �� �ʤ�
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
					
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
