package _13Generic;

import java.util.Scanner;

class boxbox<T>{
	
	//�ʵ� == �ν��Ͻ�����;
	private T t;
	
	//Getter �޼ҵ�
	public T get() {
		return t;
	}
	//Setter �޼ҵ�
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
