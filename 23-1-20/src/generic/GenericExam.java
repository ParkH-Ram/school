package generic;

public class GenericExam {

	//Ÿ�� �Ķ���� ����
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);            //T�� Integer�� ��ü
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
