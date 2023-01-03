package hongong;

public class Child연습 {
	
	public static void main(String[]args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();     // Child 클래스를 생성하고 Parent 클래스를 참조 
			  //변수            // 객체 
		
	
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";       //불가
//		parent.method3();              //불가
		
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";		//가능
		child.method3();             //가능
	}

}
