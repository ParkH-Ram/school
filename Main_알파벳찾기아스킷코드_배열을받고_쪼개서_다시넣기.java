package backjun;

import java.util.Scanner;

public class Main_알파벳찾기아스킷코드_배열을받고_쪼개서_다시넣기 {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	String S;     //입력 받을 문자열
	int i;        // 반복문 돌릴 
	int j;
	int[] arrry = new int[26];
	for(int k=0;k<arrry.length;k++) {
		// 초기값 -1로 세팅 
		arrry[k]=-1;
	}
	
	S=hi.nextLine();
	for(i=0; i<S.length(); i++) {
		//받은 스트링의 길으로 for문 돌림
		j = (int)S.charAt(i)-'a';
		// j에 쪼갠 값을 넣어 줌 
		if(arrry[j] == -1)
			// 그 번호의 알파벳이 나오면 -1을 어떤 숫자로 바꾸잖아요 
			// -1 일때만 바꿔주고 이미 바껴 있는 상태일 때는 안 바꾹호
			// 처음에 나온 것만 바꾸고 그 다음에 바꾼건 적용 x
		arrry[j] = i;
		
		
		
//		// j = (형변환) S를 앞에서 부터  쪼개서, 
//		// 쪼갠걸 소문자a 아스키코드 만큼 빼서  j 출력 
//		System.out.println(j);
	}
	for(int k=0;k<arrry.length;k++) {
	    System.out.print(arrry[k] + " ");
	    //출력은 다시 돌면서 인덱스에 저장 된 값을 출력
	}
	
	hi.close();
	}
	
}
