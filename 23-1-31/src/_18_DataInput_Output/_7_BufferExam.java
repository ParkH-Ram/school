package _18_DataInput_Output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class _7_BufferExam {
	public static void main(String[]args) throws Exception {
		//����� ��Ʈ�� ����
		String Path1 = _7_BufferExam.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(Path1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//����� ��Ʈ�� + ���� ��Ʈ�� ����
		String Path2 = _7_BufferExam.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(Path2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//���۸� ������� �ʰ� ����
		long nonBufferTime = copy(fis, fos);
		System.out.println("���� �̻��: \t" + nonBufferTime + "ns");
		
		//���� ��� ����
		long bufferTime = copy(bis, bos);
		System.out.println("���� ��� : \t " + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	private static long copy(InputStream is, OutputStream os) throws Exception{
		// ���� �ð� ����
		long start = System.nanoTime();
		//1����Ʈ�� �а� 1 ����Ʈ�� ���
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		//�� �ð� ����
		long end = System.nanoTime();
		System.out.println(start);
		System.out.println(end);
		//����ð� ����
		return (end-start);
	}

}
