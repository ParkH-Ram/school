package _13Generic;

public class _2_HomeAgency implements _2_Rentable<_2_Home2>{
				// 렌터블 홈으로 사용할 수 있는 홈 에이전시를 하나 선언하겠다 . p -> _2_Home2;
	
	@Override
	public _2_Home2 rent() { // 리턴 타입이 반드시 제네릭 타입 에서 바꿔준 값이 들어가야 함
	return new _2_Home2();
	}
}
