package thisjava;

public class Generic_HomeAgency implements Generic_Rentalbe {
	//타입 파라미터 P를 Home 타입으로 대체
	
	@Override
	public Generic_Home rent() {
		
		//리턴 타입 반드시 존재
		return new Generic_Home();
	}

}
