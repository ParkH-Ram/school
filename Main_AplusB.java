package ����;

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
		// ������� ������ �о� �ͼ� ���ڷ� �ٲ۴�.
		for(int i=1; i<=c; i++) {
			a = Integer.parseInt(br.readLine());  
			
			b = Integer.parseInt(br.readLine());
			System.out.println(a+b);
		}
		
	//StringTokenizer ���ۿ� ������  �ϳ��� ��� ��	
		
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}

		
	}

}
