package thisjava;

public class SmartPhoneExam {
	
	public static void main(String[]args) {
		SmartPhone myP = new SmartPhone("갤럭시", "은색");
		
		System.out.println(myP.model);
		System.out.println(myP.color);
		
		
		System.out.println(myP.wifi);
		
		myP.bell();
		myP.sendVoice("엽세여");
		myP.receiveVoice("즈는 누구에여");
	}
	

}
