package thisjava;

public class Exception_RethrowExam {
	
	//���� �޼ҵ�
	public static void main(String[]args) {
		
		//try some code
		try {
			System.out.println("�ܺ� try");
			try {
				System.out.println("���� try");
				Exception e = new Exception();
				throw e;
			}catch (Exception e) {
				System.out.println("���� Ʈ���� ĳġ " + e);
				System.out.println("�ѹ� ��");
				throw e;
				
			}
			finally {
				System.out.println("finally ���");
			}
		}catch(Exception e) {
			System.out.println("�ܺ� ĳġ" + e);
		}
		System.out.println("����");
	}

}
