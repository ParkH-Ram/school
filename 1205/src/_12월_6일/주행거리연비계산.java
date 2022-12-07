package _12월_6일;

import java.util.Scanner;

public class 주행거리연비계산 {
	public static void main(String[]args) {
		// 주행 연비 계산
		double driveDistance;		//주행 거리
		double fuels;				// 사용한 휘발유
		double fuelEfficiency;		// 연비
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주행 거리를 입력하세요");
		driveDistance = scan.nextDouble();
		System.out.println("사용한 휘발유 양 입력" + "L");
		fuels = scan.nextDouble();
		fuelEfficiency = driveDistance / fuels;
		System.out.println("연비 : " + fuelEfficiency);
	}

}
