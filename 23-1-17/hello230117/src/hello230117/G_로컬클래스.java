package hello230117;

public class G_로컬클래스 {
	
	public void method1(int arg) {
		int var = 1;
		class H{
			void method2() {
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
			}
		}
		
		H h= new H();
		h.method2();
		
		
		
		
//		arg = 3;      클래스 안에 메소드 안에 클래스를 넣으면 값이 기본적으로 final 설정
//		var = 3;
	}
	void method3() {
		method1(5);        //매개변수에 값을 넣어주려면 또 메소드를 만들어야 함 
	}
	
	public static void main(String[]args) {
		G_로컬클래스 g = new G_로컬클래스();
		g.method3();
	}
}

