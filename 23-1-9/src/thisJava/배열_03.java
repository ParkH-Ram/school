package thisJava;

public class �迭_03 {

	public static void main(String[]args) {
		
		int [][] mathScores = new int[2][3];
			for(int k=0; k<mathScores.length; k++) {
				for (int i=0; i<mathScores[k].length; i++) {
					
				System.out.println("[" +k+ "]" +"[" +i+ "]" + mathScores[k][i]);
				
				}
				
			}
		
				//�迭 �� �׸� ����
				mathScores[0][0]= 11;
				mathScores[0][1]= 22;
				mathScores[0][2]= 433;
				mathScores[1][0]= 55;
				mathScores[1][1]= 66;
				mathScores[1][2]= 6;
				
				//��ü �л��� ���� ���
				
				int totalStudent = 0;
				int totalMathSum = 0;
				
				for(int i=0; i<mathScores.length; i++) {
					totalStudent += mathScores[i].length;
					for(int k=0; k<mathScores[i].length; k++) {
						totalMathSum += mathScores[i][k];
					}
				}
				System.out.println(totalStudent);
				System.out.println(totalMathSum);
				
				
		
		
	}
}
