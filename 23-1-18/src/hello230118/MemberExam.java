package hello230118;

public class MemberExam {

	public static void main(String[] args) {
		Member obj1 = new Member("blue", "1234", "B");
		Member obj2 = new Member("blue", "123", "B");
		Member obj3 = new Member("red", "1234", "R");
	
	
		
		if(obj1.equals(obj2)) {
			System.out.println("°´Ã¤ µ¿ÀÏ");
		}else {
			System.out.println("°´Ã¤ °ª ´Ù¸§");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("°´Ã¤ °ª °°À½");
		}else
			System.out.println("°´Ã¤ °ª ´Ù¸§");
		
		
		if(obj2.equals(obj3)) {
			System.out.println("°´Ã¤  °°À½");
		}else
			System.out.println("°´Ã¤ °ª ´Ù¸§");
		

		}

	

}
