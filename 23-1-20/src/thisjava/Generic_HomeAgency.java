package thisjava;

public class Generic_HomeAgency implements Generic_Rentalbe {
	//Ÿ�� �Ķ���� P�� Home Ÿ������ ��ü
	
	@Override
	public Generic_Home rent() {
		
		//���� Ÿ�� �ݵ�� ����
		return new Generic_Home();
	}

}
