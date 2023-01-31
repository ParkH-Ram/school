package _18_DataInput_Output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _8_DataInputOutputStreamExamdb���ϸ�����б� {
	public static void main(String[]args) throws Exception{
		
		//DataOutputStream ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/gildong.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//�⺻ Ÿ�� �̤�����    // db ���Ϸ� ��ǻ�Ͱ� ���� ������ ���
		dos.writeUTF("�����");
		dos.writeDouble(445758.4585136);
		dos.writeInt(53643758);
		
		
		dos.writeUTF("���浿");
		dos.writeDouble(55.344);
		dos.writeInt(4);
		
		dos.writeUTF("��浿");
		dos.writeDouble(25.5);
		dos.writeInt(5);
		
		
		dos.close();
		fos.close();
		
		//DataInputStream ����
		FileInputStream fis = new FileInputStream("C:/Temp/gildong.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//�⺻ Ÿ�� �Է�
		for(int i=0; i<3; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
		
	}

}
