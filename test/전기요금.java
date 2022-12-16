package test;

import java.util.Scanner;

public class 전기요금 {
	
	public static void main(String[]args) {
		
		int [] elecArray = new int[3];
			double payment = 0;
			elecArray[0] = 200;
			elecArray[1] = 200;
			elecArray[2] = 200;
			
		Scanner input = new Scanner(System.in);
		System.out.println("전기 사용량을 입력하세요");
		  elecArray[2] = input.nextInt();
		  //배열을 설정해도 답을 바꿔서 덮어 쓸 수 있음.
			
		  if (elecArray[2]<=200) {
			  payment = 910+elecArray[2] * 93.3;
			  //200 이하의 경우이므로 910 을 
			//입력받은 elecArray[2]의 값이 200보다 낮으면 elecArray[2]에 93.3을 곱한다.
			  //곱하고 910을 더한 값을 payment에 저장한다.
		  } else if (elecArray[2]>200&&elecArray[2]<400) {
			  payment = 1600+((elecArray[2]-200)* 187.9) + (elecArray[0]*93.3);
		  }
		  // 200 부터 400 사이의 경우이므로 1600을 더한다 
		  // 입력 받은 elecArray[2]의 값에 200을 빼서 200을 초과하는 부분을 구한다.
		  // 200을 초과하는 부분에 대해서 187.9를 곱한다.
		  // 200까지의 부분인 elecArray[0]에 93.3을 곱한다.
		  // 모두 더한 값을 payment에 저장한다.
		  
		  else if (elecArray[2]>=400) {
			 payment = 7300+(elecArray[1]*187.9) + (elecArray[0]*93.3) + (elecArray[2]-elecArray[0]-elecArray[1]*280.6);
		  } // 400을 초과하는 경우 이므로 7300을 더한다
		  //입력한 elecArray[2]이 400보다 크다면 200이 저장된 elecArray[1]과  187.9를 곱한다
		  //elecArray[0]93.3을 곱한다 400을 초과하는 경우에 대한 코드이므로 400을 elecArray[2]에서 빼고 최고 누진세 280.6을 곱한다.
		  //elecArray[0] + elecArray[1] + elecArray[2] 의 값을 payment에  저장한다
		 
		  System.out.print("기본요금 : " + payment);
		
		
		  
	}
	

}
