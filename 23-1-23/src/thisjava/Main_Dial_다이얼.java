package thisjava;
import java.util.Scanner;


// 알고리즘
// 문자 입력 받고
// 입력 받은 문자의 길이를 파악 후
// 입력 받은 문자 만큼 포문을 돌리고
// 스위치문으로 돌린다. 스위치문의 조건은 입력받은 문자를 길이 만큼 반복
// A-Z 까지 case로 넣어 준뒤 합 한 다 
// 출력 끝.

public class Main_Dial_다이얼 {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int sum=0;
		
		String al = hi.nextLine();
		int leng = al.length();

		for(int i=0; i<leng; i++) {
		switch(al.charAt(i)) {  //입력 받은걸 하나씩 쪼갠다.
		
		case 'A': case 'B': case'C':
			sum = sum+3;
			break;
		case 'D': case 'E': case'F':
			sum = sum+4;
			break;
		case 'G': case 'H': case'I':
			sum = sum+5;
			break;
		case 'J': case 'K': case'L':
			sum = sum+6;
			break;
		case 'M': case 'N': case'O':
			sum = sum+7;
			break;
		case 'P': case 'Q': case'R':case'S':
			sum = sum+8;
			break;
		case 'T': case 'U': case'V':
			sum = sum+9;
			break;
		case 'W': case 'X': case'Y': case'Z':
			sum = sum+10;
			break;
		default:
			break;	
		}
	}
	
	System.out.println(sum);
	hi.close();	
	}

}
