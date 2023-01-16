package thisJava;

// 인터페이스는 상수와 추상메서드만 사용 가능
public interface Interface_RemoteControl {
	
//	int MAX_VOLUME = 0;
	void turnOn3();
	void turnOff3();
	
//	//상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
//	
//	//추상 메서드
//	public void turnOn1();               
//	public void turnOff();
//	void setVolume(int volume);
//	
//	//디폴트 인스턴스 메소드
//	default void setMute(boolean mute) {
//		if(mute) {
//			System.out.println("무음");
//			setVolume(MIN_VOLUME);
//		}else {
//			System.out.println("무음 끝");
//		}
//	}

}
