package _13Generic;

public class _2_CarAgency implements _2_Rentable<_2_Car2>{
	
	@Override
	public _2_Car2 rent() {   //rent() ȣ�� �� �� _2_Car2�� ������ �ȴ�
		return new _2_Car2();   // ��ü�� �����ؼ� �ش�   car car1 = new car(){
	}

}
