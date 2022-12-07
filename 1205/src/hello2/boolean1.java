package hello2;

public class boolean1 {
	
	public static void main(String []args) {
		
		boolean stop = false; //stop 변수를 boolean 타입으로 설정하고 값은 참을 대입
		 if (stop) {
			 System.out.println("중지합니다.");
		 } else {
			 System.out.println("시작");
		 }
		 
		 int x = 10;
		 boolean result1 = (x == 20);
		 boolean result2 = (x != 20);
		 System.out.println("result : " + result1);
		 System.out.println("result : " + result2);

	}
}
