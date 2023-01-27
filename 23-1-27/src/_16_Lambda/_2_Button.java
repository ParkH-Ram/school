package _16_Lambda;

public class _2_Button {
	
	//정적 멤버 인터페이스
	
	//펑셔널인터페이스 어노테이션은 컴파일 과정에서 추상메서드가 하난지 아닌지 확인해줌
	//FunctionalInterface Annotation은
	@FunctionalInterface
	public static interface ClickListener{
		//추상메서드
		void onClick();
	}
	
	//필드 = 클래스 변수 
	private ClickListener clickL;
	
	//메서드
	public void setClickListener(ClickListener clickL) {
		this.clickL = clickL;
	}
	
	public void click() {
		this.clickL.onClick();
	}

}
