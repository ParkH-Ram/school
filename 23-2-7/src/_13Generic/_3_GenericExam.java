package _13Generic;

public class _3_GenericExam {
	//���׸� �޼���
	public static <T>_3_Box<T> boxing(T t){
		_3_Box<T> box = new _3_Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[]args) {
		//���׸� �޼��� ȣ��
		_3_Box<Integer> box1 = boxing(100);
		int bo = box1.get();
		System.out.println(bo);
		
		
		//���׸� �޼��� ȣ��
		_3_Box<String> box2 = boxing("�ڶ�");
		String strV = box2.get();
		System.out.println(strV);
	}

}
