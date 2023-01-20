package thisjava;

//타입 파라미터 P를 Car로 대체
public class Generic_CarAgency implements Generic_Rentalbe<Generic_Car2>{
	@Override
	public Generic_Car2 rent() {
		
		//리턴타입이 반드시 Car
		return new Generic_Car2();
	}

}
