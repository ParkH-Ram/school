package thisJava;

public class Drive_Exam {

	public static void main(String[] args) {
		
		Drive_Vehicle veh = new Drive_Bus(); // veh�� ū  ���� 
		Drive_Vehicle vh2 = new Drive_taxi();   // �ý� ��ȯ
		
		veh.run();

		
		Drive_Bus bus = (Drive_Bus)veh; // Drive_Bus ���·� 
//		bus.checkFare();                     //����ȯ �Ҷ��� �̷��� ����
		
		Drive_taxi taxi = (Drive_taxi)vh2;
		taxi.run();
		taxi.checkFare();
	}

}
