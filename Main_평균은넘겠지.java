package backjun;

import java.util.*;

public class Main_평균은넘겠지 {

	public static void main(String[]args) {
	
	Scanner hi = new Scanner(System.in);	
		
	int i;      	//n1 for문 돌릴 변수
	int j;			//n2 for문 돌릴 변수 
	int k;			//n2 for문 돌릴 변수
	int n1;			//최초 입력 값 ( 몇 줄 실행 할 건지 )
	int []n2;       //두번째 몇명 인지 파악 후 그 배열 안에 값을 넣어 주는 거 가찌
	double sum=0;	// n2[index]에  받은 값들을 저장
	double avg=0;	// 받은 값들을 n2.length 로 나누기 
	int count=0;	// 평균이 넘는 학생 체크하기 위해
	double value;	// 평균이 넘는 학생을 구한 후 몇 프로인지 출력하기 위해
	
	n1 = hi.nextInt();    	// 몇 줄이니
	for(i=0; i<n1; i++) { 	// 몇 줄인지 돌리면서 하나하나 입력
		count=0;			// count 초기화
		sum=0;				// sum 초기화
		value=0;			// value 초기화
		avg=0;				// avg 초기화
		n2 = new int[hi.nextInt()];   	//n2 안에 들어갈 인덱스 수를 받아줌 
		for(j=0; j<n2.length; j++) {	//n2 길이로  j를 돌려줌 
			n2[j] = hi.nextInt();		//for문으로 돌린 j를 n2 index에 반영
			sum += n2[j];				// n2[j] 값들을 저장
		}
		avg = sum/n2.length;			//평균 계산 
		for(k=0; k<n2.length; k++) {	// n2길이로 다시 for문을 돌리고
			if(avg<n2[k]) {				// 만약 avg가 n2[인덱스] 보다 작으면
				count++;  				// count ++
			}
		
		}
		value = count/(double)n2.length;  //  평균 넘은 학생수 / 학생수 = value
		System.out.printf("%.3f%%\n", Math.round(value*100000f)/1000f);
	}			// %.3f%%\n  소수점
				// 퍼센트 뒤에 출력형식이 나오는데 소수점 뒤에 몇자리 까지 / 실수 / 
				// %% 두개 받으면 문자 퍼센트로 출력  \n 개 행 문자 ( 행을 연다는 거  줄바꿈 엔터같은 애들 ) 
	

	
	
}


}