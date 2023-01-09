package thisJava;

public class 다차원배열 {
	
	public static void main(String[]args) {
		
		int[][] scores = {   //
				{80,90,96},
				{76,88}
		};
		
		System.out.println("1차원 배열 길이 (반의 수): " + scores.length);
		System.out.println("2차원 배열 길이 (첫번째 반): " + scores[0].length);
		System.out.println("2차원 배열 길이 (두번째 반): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println("첫 번째 반의 총합: " + class1Sum);

		int class2Sum = 0;
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.println("두 번째 반의 총합: " +  class2Sum);
		
		System.out.println("첫 번째 반의 평균: " + class1Sum/(float)scores[0].length );
		System.out.println("두 번째 반의 평균: " + class2Sum/(float)scores[1].length );
		
	}

}
