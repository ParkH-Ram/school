package gogo;

//  실습 5.3: ComputeGPA.java
//  각 과목에 대해 과목명과 평가 요소들의 점수들을 입력받아 총점을 계산하고
//  학점을 부여한다. 그 다음에 평점(학점 평균)을 계산한다.

// 사용자가 키보드에 입력하는 데이터를 읽기 위해서 Scanner 클래스를 사용한다
import java.util.Scanner;

public class Gpa 
{
   public static void main(String[] args)
   {

       // 각 과목의 이름과 평가 요소들의 점수들을 저장하는 변수들을 선언한다.
       String eng, 프로그래밍, 이산수학 , 컴퓨터구조; // 스트링이 기본 타입이 아니라서,  문자열은 = 객체  값 자체가 주소라서 ..
       														// 주소를 불러오는...
      
       String i;                                       // 객체는 == 으로 비교가 안되고 equals 
       
       double engcheck, enghome, engsusi, engmiddle, englast;
       double procheck, prohome, prosusi, promiddle, prolast;
       double mathcheck, mathhome, mathsusi, mathmiddle, mathlast;
       double cscheck, cshome, cssusi, csmiddle, cslast;
       
       double engtotal, prototal, mathtotal, cstotal, total; 
       

        Scanner scan = new Scanner (System.in); //
       

        System.out.print("과목을 입력 하세요:\t");
        i = scan.nextLine();
        System.out.print(i);
        
         if(i.equals("eng")) {
	      	System.out.print("과제 점수를 입력하세요:\t\t");
	      	engcheck = scan.nextInt() * 0.1;
	      	System.out.print("수시 점수를 입력하세요:\t\t");
	      	enghome = scan.nextInt() * 0.4;
	      	System.out.print("중간시험 점수를 입력하세요:\t\t");
	      	engsusi = scan.nextInt() * 0.1;
	      	System.out.print("기말시험 점수를 입력하세요:\t\t");
	      	engmiddle = scan.nextInt() * 0.2;
	      	System.out.print("출석 점수를 입력하세요:\t\t");
	      	englast = scan.nextInt() * 0.2; 
	      	
	      	engtotal = engcheck + enghome + engsusi + engmiddle + englast;
	      	System.out.println(engtotal);
	      	
        
        
         }
        

		  	// 과목의 총점을 계산하고 출력한다.

		
		  	// 과목의 학점을 결정한다.
		  			// 여기에 코드를 삽입하세요
		
		  	// 과목의 이름과 학점을 출력한다.
					// 여기에 코드를 삽입하세요
		
		  	// 학점들의 누계를 계산한다.
					// 여기에 코드를 삽입하세요
		
		  	// 사용자가 계속하기를 원하는 지를 예(y) 혹은 아니오(n)로 입력하라고
		  	// 요청한다. 그리고 입력된 값을 읽는다.
	
		        // 평점을 계산하고 출력한다
       		       				// 여기에 코드를 삽입하세요
   scan.close();
   }
}
