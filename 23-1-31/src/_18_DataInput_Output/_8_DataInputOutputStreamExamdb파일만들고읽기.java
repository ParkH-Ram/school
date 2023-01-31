package _18_DataInput_Output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _8_DataInputOutputStreamExamdb파일만들고읽기 {
	public static void main(String[]args) throws Exception{
		
		//DataOutputStream 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/gildong.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//기본 타입 ㅜㅊㄹ력    // db 파일로 컴퓨터가 읽은 내용을 출력
		dos.writeUTF("박희라");
		dos.writeDouble(445758.4585136);
		dos.writeInt(53643758);
		
		
		dos.writeUTF("남길동");
		dos.writeDouble(55.344);
		dos.writeInt(4);
		
		dos.writeUTF("김길동");
		dos.writeDouble(25.5);
		dos.writeInt(5);
		
		
		dos.close();
		fos.close();
		
		//DataInputStream 생성
		FileInputStream fis = new FileInputStream("C:/Temp/gildong.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//기본 타입 입력
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
