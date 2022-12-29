package 공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_AplusB {
	
	public static void main(String[]args) {
	int a,b,c;
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 
		c = Integer.parseInt(br.readLine());
		// 리드라인 한줄을 읽어 와서 숫자로 바꾼다.
		for(int i=1; i<=c; i++) {
			a = Integer.parseInt(br.readLine());  
			
			b = Integer.parseInt(br.readLine());
			System.out.println(a+b);
		}
		
	//StringTokenizer 버퍼에 받은걸  하나씩 끊어서 씀	
		
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}

		
	}

}
