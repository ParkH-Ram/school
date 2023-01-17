package hello230117;

public class Interface_ButtonExam {
	public static void main(String[]args) {
		
		//OK버튼 객체 생성
		Interface_Button btok = new Interface_Button();
		
		//버튼 클래스안에 클릭리스너 구현  OkListener 선언
		class OkListener implements Interface_Button.ClickListener{
			@Override
			public void onClick() {     // 추상메서드 상세 구현
				System.out.println("k버튼 클릭함");
			}
		}
		btok.setClickListener(new OkListener());
		btok.click();
		
		class NoListener implements Interface_Button.ClickListener{
			public void onClick() {
				System.out.println("놉");
			}
		}
		btok.setClickListener(new NoListener());
		btok.click();
	}
}
