package hello230117;

public class Interface_Button {
	
	public static interface ClickListener{
		
		//�߻�޼���
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
