
public class ���ܽǽ�3 {
	public static void main(String[]args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.StringŬ������ ����");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2Ŭ������ ����");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
