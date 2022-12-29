package 공부;

public class Main_셀프넘버 {

	public static void main(String[] args) {
		
		int[]i = new int [10001];   // 배열 만개 선언
		int h4;          // 천자리 
		int h3;			// 백자리
		int h2;			// 십자리
		int h1;			// 
		int tmp=0;		// 임시변수
		for (int j=0; j<10000; j++) {
			h4 = j/1000; 
			tmp=j%1000;
			h3 = tmp/100;
			tmp=tmp%100;
			h2 = tmp/10;
			h1 = tmp%10;
			tmp = j+h1+h2+h3+h4; //  정의가 생성자가 있는 넘버 들을 출력 
			//tmp의 생성자가 j
			// 그런 tmp를 셀프넘버가 아닌 수 
			// 저런 생성자가 없는 수식어로 만들 수 가 없는 수가 셀프넘버 
			if(tmp<10000) // 더해진 값들이 10000이 넘어가면 
				i[tmp] = 1;  // 1로 초기화 
		
	
		}
		for (int j=0; j<10000; j++) {
			if(i[j]!=1) {
				System.out.println(j);
			}
		}


	}

}
