package _class;

public class class4_test2 {

		public static void main (String[] args)
	    {
			// 첫 번째 Employee 객체 참조 변수
	    	
 
	    	// 두 번째 Employee 객체 참조 변수
	  			// 여기에 코드를 삽입하세요
	    	
			// Employee 객체를 생성하고 emp1이 가리키게 한다
	    	Employee emp1 = new Employee( );  // 클래스를 적용 시켜 준다.

			// emp1의 이름을 ‘이도령’으로 변경한다
			emp1.setName("이도령");
			//emp1.name="이도령";
			// emp1의 번호를 100으로 변경한다
			emp1.setNumber(100);

			// emp1의 나이를 25로 변경한다
			emp1.setAge(25);

	        // emp1의 이름, 번호와 나이를 출력한다
			System.out.println(emp1.toString());

			// Employee 객체를 생성하고 emp2가 가리키게 한다
			Employee emp2 = new Employee( );	
			
			// 여기에 코드를 삽입하세요

			// emp2의 이름을 ‘성춘향’으로 변경한다
			emp2.setName("성춘향");
	  			// 여기에 코드를 삽입하세요

			// emp2의 번호를 200으로 변경한다
			emp2.setNumber(200);
	  			// 여기에 코드를 삽입하세요

			// emp2의 나이를 18로 변경한다
			emp2.setAge(18);
				// 여기에 코드를 삽입하세요

			// emp2의 이름, 번호와 나이를 출력한다
			System.out.println(emp2.toString());
	  			// 여기에 코드를 삽입하세요

	        // emp2의 번호를 300으로 변경한다
		
			 emp2.setNumber(300);   //set 클래스에 있는 변수값  Age를 변경할 때 사용
	  			// 여기에 코드를 삽입하세요
			 System.out.println(emp2.toString());
			// emp1의 이름, 번호와 나이를 출력한다
	  			// 여기에 코드를 삽입하세요
	    }
	

}
