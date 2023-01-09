package thisJava;

public class 배열_01 {
	
	public static void main(String[]args) {
		
		int[]scores;						//배열의 변수 선언 : 값은 없음 null	
		scores = new int[] {83,99,95}; 		//new 이용해서 데이터 값 입력
		
		int sum=0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		
		//배열을 매개값으로 주고, 메소드 호출
		printItem( new int[] {83,99,43,87,87,98,6,5,6,4,9,7,79,98} );
		// 메소드 호출 하는 거 참고. 
	}
	public static void printItem( int[] scores ) {
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
	
}
