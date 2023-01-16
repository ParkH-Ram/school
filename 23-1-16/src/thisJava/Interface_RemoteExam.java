package thisJava;

public class Interface_RemoteExam {
	public static void main(String[]args) {
		Interface_RemoteControl rc1;             //통합 리모컨
		rc1 = new Interface_Television();        // tv 버튼을 눌렀다?
		rc1.setMute(true);
		rc1.turnOn1();
		rc1.setMute(false);
		
		
		Interface_RemoteControl rc2;
		rc2 = new Interface_Audio(); //오디
		rc2.turnOn1();
		
		Interface_Television tv = new Interface_Television();   // 리비 리모컨
		tv.turnOn1();
		Interface_Audio au = new Interface_Audio();
		au.turnOn1();
		
		rc1.setVolume(15);
		rc2.setVolume(-100);
		rc2.setVolume(3);
		rc2.setMute(true);
		rc2.setMute(false);
		
		
		
	}

}
