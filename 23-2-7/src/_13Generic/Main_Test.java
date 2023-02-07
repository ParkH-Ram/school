package _13Generic;

import java.util.Scanner;

class boxbox<T>{
	
	//필드 == 인스턴스변수;
	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	//Setter 메소드
	public void set(T t) {
		this.t = t;    
	}
}


public class Main_Test {
	public static void main(String[]args){
		Scanner hi = new Scanner(System.in);
		
		boxbox<Integer> a = new boxbox<>();
		a.set(hi.nextInt());
		
		boxbox<Integer> b = new boxbox<>();
		b.set(hi.nextInt());
		System.out.println(a.get()+b.get());
	}
}
