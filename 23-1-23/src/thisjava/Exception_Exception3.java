package thisjava;
import java.util.Scanner;
class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}

}

public class Exception_Exception3 {
	
	public static boolean ticketing(int age) throws AgeException{

		if(age<0) {
			throw new AgeException("입력 다시 하세요");
		}else if(age<20) {
			throw new AgeException("미성년자 집가라");
		}
		else
			return false;//메서드 리턴타입을 불리안으로 하고 성인나이가 나올 경우 false 리턴
		}

	public static void main(String[]args) {
	
		Scanner hi = new Scanner(System.in);
		boolean flag = true;// 처음에 true 초기값
		while(flag) {//처음엔 들어
			int age = hi.nextInt();
			try {
				flag = ticketing(age);
			}catch(AgeException e) {
				System.err.println(e.getMessage());
				// 에러 메시지만 표시하는데 빨갛게 표시
			}
		}
		System.out.println("이제 부터 게임을 시작 하겠습니다.");
//			그니까 예외처리는 시스템적인 오류가 생겼을 때만 사용하는 
//			시스템적은 오류를 허용하고 사용하겠다 했을 때 사용
//			if는 시스템적인 오류가 아니고 그냥 
		
	}

}
