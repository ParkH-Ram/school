
public class ���ܽǽ�2 {
	public static void  printlength(String data) {
		try {
			int result = data.length();
			System.out.println("���ڼ� : " + result);	
		}catch (NullPointerException e) {        //e �̺�Ʈ
			System.out.println(e.getMessage());		//�����ϰ� ���� ���
			System.out.println(e.toString());		//� ���ܰ� �߻������� ��� 
			e.printStackTrace();					//���ܿ� ���� �� ��� : ��𿡼� ���� �߻� �ߴ���
		}finally {
		System.out.println("������ ����");
		}
	}
	
	public static void main(String[]args) {
		System.out.println("[���α׷� ����]\n");
		printlength("�ڴ������� �ٺ��Դϴ�.");
		printlength(null);
		System.out.println("����");
		
	}

}
