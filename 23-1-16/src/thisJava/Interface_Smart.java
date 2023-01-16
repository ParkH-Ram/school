package thisJava;

public class Interface_Smart implements Interface_RemoteControl, Interface_Search {

	@Override
	public void search(String url) {
		System.out.println(url + "À» °Ë»ö");
		
	}

	@Override
	public void turnOn3() {
		System.out.println("TvÅ´");
		
	}

	@Override
	public void turnOff3() {
		System.out.println("Tv²û");
		
	}
	

}
