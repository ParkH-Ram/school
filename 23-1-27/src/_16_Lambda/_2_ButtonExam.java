package _16_Lambda;

public class _2_ButtonExam {
	public static void main(String[]args) {
		//Ok버튼 객체 생성
		_2_Button btOk = new _2_Button();
		
		//Ok 버튼 객체에 람다식 ( ClickListener 익명 구현 객체) 주입
		
		btOk.setClickListener(() -> System.out.println("ok 클릭"));
		
		//Ok버튼 클릭하기
		btOk.click();
		
		//Cancel 버튼 객체 생성
		_2_Button btClose = new _2_Button();
		
		btClose.setClickListener(() -> System.out.println("Close 클릭"));
		
		btClose.click();
	}

}
