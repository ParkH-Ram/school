package Array;


import java.util.Scanner;

public class ques_3되는거{
	
	public static void main (String[] args) {
		
		boolean run = true;     // 무한 루프 돌리기 위해 boolean 생성
		Scanner scan = new Scanner(System.in);
		int student=0;
		
		int [] score = null;        //배열 설정 
	
		
		
		
		while (run) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("선택 > ");
		int choice = scan.nextInt();
		
			switch(choice) {
				
				case 1 :
					
			         System.out.printf("학생수 > ");
			         student = scan.nextInt();	
			         score = new int[student];        // 배열안에 입력한 학생 수를 넣어줌. 
			         break;
				case 2 :
					
					for(int i = 0; i<score.length; i++) {   // 입력된 score 의 길이를 입력
						
						
						System.out.printf("scores[" + i+"] > ");   //  scores[ + i +] > 형식으로 텍스트 입력
						score[i] = scan.nextInt();    // i 에 점수를 입력 받음
						
					}
					
					
					break;
					
				case 3 :
					
					for(int i = 0; i<score.length; i++) {
						System.out.println("scores[" + i+"] > "+ score[i]);   // 2번에서 입력한 점수를 출력
					}
					break;
					
				case 4 :
					int max = score[0];
					int min = score[0];
					int sum=0;
					
					
				for(int num:score){
							max = Math.max(num, max);
							min = Math.min(num, min);
					for (int i=0; i<score.length; i++ ) {
						sum+=score[i];
					}
							
							
					
						
						System.out.printf("총 점수 > "  + sum + "\n");
						System.out.printf("최저 점수 > " + min+ "\n");
						System.out.printf("최고 점수 > " + max+ "\n");
						System.out.printf("평균 점수 > " + (double)sum/student +"\n"); // 형변환
						break;
					}
				
					
					
					
					
					
					
				default : 
					
					run = false;          // 1~4이외 숫자 선택시 종료
					

					System.out.printf("종료 합니다" );     //
				
				}
				
				
			
			
			}
		
		
	
		
		scan.close();
	    }

	
	
}	



