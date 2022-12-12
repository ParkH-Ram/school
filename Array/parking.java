package Array;

import java.util.Scanner;

public class parking {
	
//  실습 6.2: CalParkingFee.java
//  주차 시간에 따라 주차요금을 계산한다.
//
// 사용자가 키보드에 입력하는 데이터를 읽기 위해서 Scanner 클래스를 사용한다

	
	static double calculateFee(double ptime) {
		double fee = 0.0;      
		
		if(ptime > 0.0) {          // 주차시간이 0 미만이면 계산 x
			if (ptime <=1.0) { 	   // 주추 시간이 1시간 미만 이면 천원
				fee = 1000;
			} else {
				fee = 1000+Math.ceil(ptime - 1.0) * 500;  // Math.ceil( 소숫점 올림 함수 )
				//주차시간이 1시간 초과 했을 시 계산 
				if (fee > 10000) {       // 최대 금액이 만원이 넘으면 
					fee = 10000;           // 금액은 만원 
				}
			}
		}
		return fee;
	}
	
    // 주차 시간이 주어지면 주차요금을 계산한다.
    // @입력 매개변수들:
    //	ptime - 주차시간
    // @반환 값: 주차요금
  			// 여기에 메소드를 삽입하세요

    public static void main(String[] args)
    {

      // 주차장에 들어온 시간, 나간 시간과  주차요금을 저장하는 변수들을 선언한다.
      double entrytime;			// 들어온 시간
      double outtime;           // 나간시간
 


      

      String flag;

    
      Scanner scan = new Scanner(System.in);


      do {

	   			System.out.print("들어온 시간을 입력하세요:\t");
	   			entrytime = scan.nextDouble();
	   			System.out.print("나간 시간을 입력하세요:\t");
	   			outtime = scan.nextDouble();
	   			System.out.println(calculateFee(outtime-entrytime));   
	   			System.out.print("나간 시간을 입력하세요:\t");
	   			flag = scan.nextLine();
  	
	   			 
      }while (flag.equals("Y"));

      scan.close();
}
   
}


