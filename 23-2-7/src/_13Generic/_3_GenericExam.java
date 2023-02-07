package _13Generic;

public class _3_GenericExam {
	//제네릭 메서드
	public static <T>_3_Box<T> boxing(T t){
		_3_Box<T> box = new _3_Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[]args) {
		//제네릭 메서드 호출
		_3_Box<Integer> box1 = boxing(100);
		int bo = box1.get();
		System.out.println(bo);
		
		
		//제네릭 메서드 호출
		_3_Box<String> box2 = boxing("박람");
		String strV = box2.get();
		System.out.println(strV);
	}

}
