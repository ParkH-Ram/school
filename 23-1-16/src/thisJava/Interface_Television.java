package thisJava;

public class Interface_Television implements Interface_RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn1() {
		System.out.println("TvŴ");
	}
	public void turnOff() {
		System.out.println("Tv��");
	}
	public void setVolume(int volume) {
		if(volume > Interface_RemoteControl.MAX_VOLUME) {
		this.volume = Interface_RemoteControl.MAX_VOLUME;	
		} else if (volume < Interface_RemoteControl.MIN_VOLUME) {
			this.volume = Interface_RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		
		System.out.println("���� : " +this.volume);
		
	}

}
