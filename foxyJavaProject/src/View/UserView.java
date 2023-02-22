package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.UsersTable;
import Model.Users;

public class UserView {

	// 뷰 
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		ArrayList<Users> list = null;  
		
		
		list = new UsersTable().select(); //   //일회용 생성자를 실행할 때 디비랑 연결하니까
		//UsersTable()를 생성하자마자 . select()문을 호출
		
		
		new UsersTable().select().forEach( us -> {  //람다식 비교
			System.out.println(us);
		}); // 회원 목록  하나씩 출력
		
		
		
		
		//  ----- delete 메서드 출력
		// 삭제 할 때 딜리트 값을 보여 주기 위해
		new UsersTable().select().forEach( us -> {  //람다식 비교
			System.out.println(us.getUserName() + " 회원 명 : " + us.getUserId());
		});
		
		System.out.println("삭제할 회원 아이디를 입력하세요");
		new UsersTable().delete(hi.nextLine());
		// 유저 테이블을 호출하고 딜리트를 바로 실행 
		
		// 딜리트 하고 딜리트 값 확인까지 
		new UsersTable().select().forEach( us -> {  //람다식 비교
			System.out.println("삭제 후 " + us.getUserName() + " "  + us.getUserId());
		});
	
		
		
		
		System.out.println("insert 할 user 입력");
	
		String one = hi.nextLine();
		String two = hi.nextLine();
		String three = hi.nextLine();
		String four = hi.nextLine();
		
		Users us = new Users(one, two, three, four);
		
		new UsersTable().insert(us); // 각 값을 받아서 바로 삽입
		System.out.println("insert" + us);
		
		
		
		one = hi.nextLine();
		two = hi.nextLine();
		three = hi.nextLine();
		four = hi.nextLine();
		
		us = new Users(one, two, three, four);
		
		new UsersTable().update(us);
		System.out.println("update" + us);
	}
	

}
