package thisjava7장_상속;

public class ChildExam {
	
	public static void main(String[]args) {
		
	
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		parent.field2 = "data2";
		parent.method3();
		
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		
		
		
//		//자식 객체 생성
//		Child child = new Child();
//	 	
//		//자동타입 변환
//		Parent parent = child;   // 자식을 부모형 변환  -> 자동변환 될 때 번지를 넘겨 주는거라 부모에 선언된 메서드만 사용 가능
//									// 번지를 넘겨 줬는데 부모 타입을 ㅗ받았을 때 부모타입에 선어 ㄴ되어 있는 메소드만 
//									// 오버라이딩 한거는 자식이 먼저 사용 되고.. 쓸 수 없어지는 거지 
//		parent.method1();
		parent.method2();        
//		parent.method3();

	}

}
