package thisJava;

public class Interface_Audio implements Interface_RemoteControl {
	private int volume;
	
	@Override
	public void turnOn1() {
		System.out.println("�����Ŵ");
	}
	public void turnOff() {
		System.out.println("�������");
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
	
	// �ʵ� �߰�
	private int memoryVolume;    // ��Ʈ ���� ��ü ���� �� �ٽ� ���� ������ ����
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;           // ���� ������ �޸� ������ ����
			this.volume = Interface_RemoteControl.MAX_VOLUME;	
		} else if (volume < Interface_RemoteControl.MIN_VOLUME) {
			this.volume = Interface_RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		
	}

}
