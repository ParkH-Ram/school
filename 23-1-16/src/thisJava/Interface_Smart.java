package thisJava;

public class Interface_Smart implements Interface_RemoteControl, Interface_Search {

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻�");
		
	}

	@Override
	public void turnOn3() {
		System.out.println("TvŴ");
		
	}

	@Override
	public void turnOff3() {
		System.out.println("Tv��");
		
	}
	

}
