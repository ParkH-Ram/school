package thisJava;

public class ���ڿ��и� {
	
	public static void main(String[]args) {
		
		String board = "1, �ڹ� �н�, ����Ÿ�� String�� �н��մϴ�., ȫ�浿";
		
		//���ڿ� �и�
		
		String [] tokens = board.split(",");  // ,�̰ɷ� ���� �ϰδ�
		
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]);
		
		for (int i=0; i<tokens.length; i++) {   // �迭��  () �� ����. ������ ����
			System.out.println(tokens[i]);
		}
		
	}

}
