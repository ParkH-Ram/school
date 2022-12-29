package ����;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ���۸������� {

	public static void main(String[]args) throws Exception {
		Scanner hi = new Scanner(System.in);
		try {
			//���۰� ���� ��Ʈ�� ����
		String origninalFilePath1 = ���۸�������.class.getResource("originalFile.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis1 = new FileInputStream(origninalFilePath1);
		FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

		//���۰� �ִ´� ��Ʈ�� ����
		String origninalFilePath2 = ���۸�������.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
	
		FileInputStream fis2 = new FileInputStream(origninalFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);

		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//���� �ð� ����
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("���� �̻��:\t" + nonBufferTime + " ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("���� �̻��:\t" + bufferTime + " ns");
		
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
		//ī�� �۾��� �ϰڴٴ� �̾߱��� 
		//ī�Ǵ� ���ʿ��� �а� �ٸ� �ʿ��� ����
		
		while (true) {
			int data = is.read();    // �迭�� �� �־� ������ �� ����Ʈ ����
			if(data == -1) break;
			os.write(data);    // �ѹ���Ʈ ���� �ѹ���Ʈ �а�
			
		}
		os.flush();    // ����Ʈ�� �� �а� �÷����� �ض� 
		
		
		long end = System.nanoTime();
		return (end-start);
	}
	
}
