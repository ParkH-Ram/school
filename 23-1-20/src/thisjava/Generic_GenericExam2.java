package thisjava;

public class Generic_GenericExam2 {
	public static void main(String[]args) {
		//K는 Tv로 대체, M은 String으로 대체
		Generic_Product<Generic_Tv, String> pro1 = new Generic_Product<>();
		
		//Setter 매개값은 반드시 Tv와 string을 제공
		pro1.setKind(new Generic_Tv());
		pro1.setModel("smartTv");
		String hi =  " ";
		hi += pro1;
		System.out.println(hi);
		
		//Getter 리턴값은 Tv와 String됨
		Generic_Tv tv = pro1.getKind();
		String tvModel = pro1.getModel();
		
		//K는 Car로 대체, M은 String 으로 대체
		Generic_Product<Generic_Car, String> pro2 = new Generic_Product<>();
		
		pro2.setKind(new Generic_Car());
		pro2.setModel("SUV자동차");
		
		Generic_Car car = pro2.getKind();
		String carModel =pro2.getModel();
	}

}
