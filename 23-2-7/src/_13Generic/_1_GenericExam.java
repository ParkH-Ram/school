package _13Generic;

public class _1_GenericExam {

	public static void main(String[] args) {
		//_1_BOX<String> box1 = new _1_BOX<String>(); 
		_1_BOX<String> box1 = new _1_BOX<String>();  //제네릭 <T>를  String으로 대입 						
		box1.content = "헬로우 브로";  //box1의 인스턴스 변수에 content 에 "헬로우 브로" 대입
		String str = box1.content; //스트링 변수에 "헬로우브로" 대입
		System.out.println(str);
		

	}

}
