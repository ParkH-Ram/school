package thisjava;

public class Generic_GenericExam2 {
	public static void main(String[]args) {
		//K�� Tv�� ��ü, M�� String���� ��ü
		Generic_Product<Generic_Tv, String> pro1 = new Generic_Product<>();
		
		//Setter �Ű����� �ݵ�� Tv�� string�� ����
		pro1.setKind(new Generic_Tv());
		pro1.setModel("smartTv");
		String hi =  " ";
		hi += pro1;
		System.out.println(hi);
		
		//Getter ���ϰ��� Tv�� String��
		Generic_Tv tv = pro1.getKind();
		String tvModel = pro1.getModel();
		
		//K�� Car�� ��ü, M�� String ���� ��ü
		Generic_Product<Generic_Car, String> pro2 = new Generic_Product<>();
		
		pro2.setKind(new Generic_Car());
		pro2.setModel("SUV�ڵ���");
		
		Generic_Car car = pro2.getKind();
		String carModel =pro2.getModel();
	}

}
