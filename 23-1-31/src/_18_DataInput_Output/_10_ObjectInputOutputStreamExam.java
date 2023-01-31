package _18_DataInput_Output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class _10_ObjectInputOutputStreamExam {
	public static void main(String[]args) throws Exception{
		//FileOutputStream�� ObjectOutputStream ���� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		
		//��ü ����
		_10_Member m1 = new _10_Member("���ѻ��", "�����");
		_10_Product_���ø�����_���ڸ����ں��� p1 = new _10_Product_���ø�����_���ڸ����ں���("���Ǳ�", 1154);  // ���ø� ���� ��� 
		int [] arr1 = {1, 2, 3};
		
		//��ü������ȭ �ؼ� ���Ͽ� ����
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.close();
		fos.close();
		
		//FileOutputStream�� ObjectOutputStream ���� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		//FileInputStream�� ObjectInputStream ���� ��Ʈ�� ����
		_10_Member m2 = (_10_Member) ois.readObject();
		_10_Product_���ø�����_���ڸ����ں��� p2 = (_10_Product_���ø�����_���ڸ����ں���) ois.readObject();
		int [] arr2 = (int[]) ois.readObject();
		
		ois.close(); fis.close();
		
		//������ ��ü ���� Ȯ��
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}
