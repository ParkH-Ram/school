package thisJava;

public class �迭_01 {
	
	public static void main(String[]args) {
		
		int[]scores;						//�迭�� ���� ���� : ���� ���� null	
		scores = new int[] {83,99,95}; 		//new �̿��ؼ� ������ �� �Է�
		
		int sum=0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		
		//�迭�� �Ű������� �ְ�, �޼ҵ� ȣ��
		printItem( new int[] {83,99,43,87,87,98,6,5,6,4,9,7,79,98} );
		// �޼ҵ� ȣ�� �ϴ� �� ����. 
	}
	public static void printItem( int[] scores ) {
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
	
}
