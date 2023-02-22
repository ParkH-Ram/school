package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.CompanyTable;
import Model.Company;

public class CompanyView {

	// 뷰 
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		ArrayList<Company> list = null;  
		
		list = new CompanyTable().select(); //   //일회용 생성자를 실행할 때 디비랑 연결하니까
		//CompanyTable()를 생성하자마자 . select()문을 호출
		
		
		new CompanyTable().select().forEach( cp -> {  //람다식 비교
			System.out.println(cp);
		}); // 회사 정보 하나씩 출력 
		
		
		
		
		//  ----- delete 메서드 출력
		// 삭제 할 때 딜리트 값을 보여 주기 위해
		new CompanyTable().select().forEach( cp -> {  //람다식 비교
			System.out.println(cp.getCompanyName() + " 회사의 코드 : " + cp.getCompanyCode());
		});
		
		System.out.println("삭제할 회사의 코드를 입력하세요");
		new CompanyTable().delete(hi.nextLine());
		// 컴퍼니 테이블을 호출하고 딜리트를 바로 실행 
		
		// 딜리트 하고 딜리트 값 확인까지 
		new CompanyTable().select().forEach( cp -> {  //람다식 비교
			System.out.println(cp.getCompanyName() + " 회사의 코드 : "  + cp.getCompanyCode());
		});
	
	
		String one = hi.nextLine();
		String two = hi.nextLine();
		String three = hi.nextLine();
		String four = hi.nextLine();
		String five = hi.nextLine();
		
		Company cp = new Company(one, two, three, four, five);
		
		new CompanyTable().insert(cp); // 각 값을 받아서 바로 삽입
		System.out.println("insert" + cp);
		
		one = hi.nextLine();
		two = hi.nextLine();
		three = hi.nextLine();
		four = hi.nextLine();
		five = hi.nextLine();
		
		cp = new Company(one, two, three, four, five);
		
		new CompanyTable().update(cp);
		System.out.println("update" + cp);
	}
	

}
