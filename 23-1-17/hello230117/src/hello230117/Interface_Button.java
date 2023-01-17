package hello230117;

public class Interface_Button {
	
	public static interface ClickListener{
		
		//추상메서드
		void onClick();
	}
		
		
		
	private ClickListener clicklistener;
		
	public void setClickListener(ClickListener clickListener) {
		this.clicklistener = clickListener;
	}
	
	public void click() {
		this.clicklistener.onClick();
	}
		
	

}
