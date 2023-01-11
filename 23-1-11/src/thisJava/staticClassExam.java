package thisJava;

public class staticClassExam {
	
	public static void main(String[]args) {
		staticClass sc1 = new staticClass();
		
		sc1.a = 10;
		sc1.b = 20;
		
		System.out.println("a = " + sc1.a);
		System.out.println("b = " + sc1.b);
		
		staticClass sc2 = new staticClass();
		sc2.b = 40; // static이 안 붙어 있어서 다른 곳에서 초기화 가능 
		sc1.a = 40;
		
		staticClass sc3 = new staticClass();
		System.out.println(sc3.a);
		
		System.out.println("a = " + sc2.a);
		System.out.println("b = " + sc2.b);
		
	}
	

}
