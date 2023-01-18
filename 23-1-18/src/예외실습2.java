
public class 예외실습2 {
	public static void  printlength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수 : " + result);	
		}catch (NullPointerException e) {        //e 이벤트
			System.out.println(e.getMessage());		//간단하게 예외 출력
			System.out.println(e.toString());		//어떤 예외가 발생한지를 출력 
			e.printStackTrace();					//예외에 대한 상세 출력 : 어디에서 예외 발생 했는지
		}finally {
		System.out.println("마무리 실행");
		}
	}
	
	public static void main(String[]args) {
		System.out.println("[프로그램 시작]\n");
		printlength("박단현님은 바보입니다.");
		printlength(null);
		System.out.println("종료");
		
	}

}
