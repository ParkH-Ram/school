package thisJava;

public class �������迭 {
	
	public static void main(String[]args) {
		
		int[][] scores = {   //
				{80,90,96},
				{76,88}
		};
		
		System.out.println("1���� �迭 ���� (���� ��): " + scores.length);
		System.out.println("2���� �迭 ���� (ù��° ��): " + scores[0].length);
		System.out.println("2���� �迭 ���� (�ι�° ��): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println("ù ��° ���� ����: " + class1Sum);

		int class2Sum = 0;
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.println("�� ��° ���� ����: " +  class2Sum);
		
		System.out.println("ù ��° ���� ���: " + class1Sum/(float)scores[0].length );
		System.out.println("�� ��° ���� ���: " + class2Sum/(float)scores[1].length );
		
	}

}
