package _13Generic;

public class _2_GenericExam {

	public static void main(String[]args) {
		
		//K는 Tv대체, M은 String 대체
		_2_Product<_2_Tv, String> product1 = new _2_Product<>();
		
		//setter 매개값으로 반드시 Tv와 String을 제공
		product1.setKind(new _2_Tv());
		product1.setModel("스마트티비");
		
		//getter 리턴값은 Tv와 String이 됨
		_2_Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K는 Car로 대체, M은 String으로 대체
		_2_Product<_2_Car, String> product2 = new _2_Product<>();
		
		//setter 매개값은 반드시 Car와 String을 제공
		product2.setKind(new _2_Car());
		product2.setModel("SUV자동차");
		
		//getter 리턴값은 Car와 String이 됨
		_2_Car car = product2.getKind();
		String carModel = product2.getModel();
		
	}
}
