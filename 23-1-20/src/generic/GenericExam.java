package generic;

public class GenericExam {

	//타입 파라미터 정의
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);            //T를 Integer로 대체
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
