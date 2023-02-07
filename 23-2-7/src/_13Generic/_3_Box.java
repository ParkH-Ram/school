package _13Generic;

public class _3_Box<T>{
	
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
