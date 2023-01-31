package _18_DataInput_Output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class _10_ObjectInputOutputStreamExam {
	public static void main(String[]args) throws Exception{
		//FileOutputStream에 ObjectOutputStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		
		//객체 생성
		_10_Member m1 = new _10_Member("착한사람", "박희람");
		_10_Product_데시멀포맷_세자리숫자분할 p1 = new _10_Product_데시멀포맷_세자리숫자분할("합의금", 1154);  // 데시멀 포맷 사용 
		int [] arr1 = {1, 2, 3};
		
		//객체를직렬화 해서 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.close();
		fos.close();
		
		//FileOutputStream에 ObjectOutputStream 보조 스트림 연결
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		//FileInputStream에 ObjectInputStream 보조 스트림 연결
		_10_Member m2 = (_10_Member) ois.readObject();
		_10_Product_데시멀포맷_세자리숫자분할 p2 = (_10_Product_데시멀포맷_세자리숫자분할) ois.readObject();
		int [] arr2 = (int[]) ois.readObject();
		
		ois.close(); fis.close();
		
		//복원된 객체 내용 확인
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}
