
public class RethrowExam {

	public static void main(String[] args) {
		try {
			System.out.println("�ܺ� try....");
			try {
				System.out.println("���� try....");
				Exception e = new Exception();
				throw e;
			}catch (Exception e) {    //�� Ʈ���� ĳġ ���� ����
				System.out.println("����Ʈ����ĳġ �ͼ���" + e);
				System.out.println("���� ������ �� ���");
				throw e;
			}finally {
				System.out.println("finally �������");
			}
		}catch (Exception e) {
			System.out.println("�ܺ� Ʈ���� ĳġ �ͼ��� : " + e);
		}
		System.out.println("�Ѵ�");

	}

}
