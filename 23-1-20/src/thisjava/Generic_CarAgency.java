package thisjava;

//Ÿ�� �Ķ���� P�� Car�� ��ü
public class Generic_CarAgency implements Generic_Rentalbe<Generic_Car2>{
	@Override
	public Generic_Car2 rent() {
		
		//����Ÿ���� �ݵ�� Car
		return new Generic_Car2();
	}

}
