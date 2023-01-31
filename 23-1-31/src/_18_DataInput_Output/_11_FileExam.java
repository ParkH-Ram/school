package _18_DataInput_Output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _11_FileExam {
	public static void main(String[]args)  throws Exception{
		//File ��ü ����
		File dir = new File("C:/Temp/images");     //images ���� ��ü ����
		File file1 = new File("C:/Temp/file1.txt"); //file1.txt ���� ����
		File file2 = new File("C:/Temp/file2.txt"); //file1.txt ���� ����
		File file3 = new File("C:/Temp/file3.txt"); //file1.txt ���� ����
	
		//�������� ������ ���丮 �Ǵ� ���� ����
		if(dir.exists() == false) {dir.mkdirs();}// ���� �ϴ��� Ȯ�� �� �������� ������ dir(images)�̶�� �̸��� ����  directory�� ������ 
		if(file1.exists() == false) {file1.createNewFile();}     
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp ������ ���� ���
		File temp  = new File("C:/Temp");        //�������
		File[] contents = temp.listFiles();      //temp �ȿ� �ִ� ����Ʈ���� contents �迭 �ȿ� ��Ƶ�
		
			//��¥�� ���� ������ ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");   //�� �� �� am,pm����  �� : ��
		
		for (File file : contents) { 
			//
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified()))); //���� �����͸� ���� ���·� ���  ������ ���� ��¥
			if(file.isDirectory()) {
				
				//��ǥ �ڿ� 2���� ����  �տ��� %-10s �� ���� get.name�� -20s�� ����
				// - ������ ���� ���� 10ĭ ���      %-10s -> ���� ���� ���� ���� 10ĭ ���� ���
				// 						  %-20s -> ���� ���� ���� ���� 20���ڰ� ������ �ʰ� ��� ���� ������ ���� ���� �� ������ ���� ���
				System.out.printf("%-10s%20s", "<DIR>", file.getName()); // Directory��� <DIR>ǥ�ÿ� DIR�� �̸��� ���
			}else {
				System.out.printf("%-10s%-20s", file.length(), file.getName()); // file�̶�� file�� ���̿� file�� �̸��� ���
			}
			System.out.println();
		}
		
		
	}

}
