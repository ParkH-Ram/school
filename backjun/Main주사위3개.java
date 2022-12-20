package backjun;

import java.util.Scanner;

public class Main주사위3개 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	int a;
	int b;
	int c;
	int same=0;
	
	a= hi.nextInt();
	b= hi.nextInt();
	c= hi.nextInt();
	
	if(a==b && a==c )         // a b c가 같을때  
		same = 10000+ a * 1000;   
	else if(a==b && b!=c)     // a 랑 b는 같지만 c랑은 같지 않을 때 
		same = 1000 + b * 100;
	else if(b==c && a!=c)	  // b 랑 c 는 같지만 a랑은 같지 않을 때
		same = 1000 + c * 100;
	else if(a==c && a!=b)	  // a랑 c 는 같지만 b랑은 같지 않을 때 
		same = 1000 + a * 100;
	else if(a!=b && b!=c)     // 다 같지 않을 때
		same = Math.max(Math.max(a, b), c) * 100;
	
	
		System.out.println(same);
	

	
	}
}

