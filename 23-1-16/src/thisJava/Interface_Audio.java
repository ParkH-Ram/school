package thisJava;

public class Interface_Audio implements Interface_RemoteControl {
	private int volume;
	
	@Override
	public void turnOn1() {
		System.out.println("오디오킴");
	}
	public void turnOff() {
		System.out.println("오디오끔");
	}
	public void setVolume(int volume) {
		if(volume > Interface_RemoteControl.MAX_VOLUME) {
		this.volume = Interface_RemoteControl.MAX_VOLUME;	
		} else if (volume < Interface_RemoteControl.MIN_VOLUME) {
			this.volume = Interface_RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		
		System.out.println("볼륨 : " +this.volume);
		
	}
	
	// 필드 추가
	private int memoryVolume;    // 뮤트 값을 해체 했을 시 다시 값을 돌리기 위한
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;           // 기존 볼륨을 메모리 볼륨에 저장
			this.volume = Interface_RemoteControl.MAX_VOLUME;	
		} else if (volume < Interface_RemoteControl.MIN_VOLUME) {
			this.volume = Interface_RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		
	}

}
