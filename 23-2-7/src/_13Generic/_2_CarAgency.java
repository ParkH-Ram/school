package _13Generic;

public class _2_CarAgency implements _2_Rentable<_2_Car2>{
	
	@Override
	public _2_Car2 rent() {   //rent() 호출 할 때 _2_Car2가 재정의 된다
		return new _2_Car2();   // 객체를 생성해서 준다   car car1 = new car(){
	}

}
