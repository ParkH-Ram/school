package _13Generic;

public class _2_HomeAgency implements _2_Rentable<_2_Home2>{
				// ���ͺ� Ȩ���� ����� �� �ִ� Ȩ �������ø� �ϳ� �����ϰڴ� . p -> _2_Home2;
	
	@Override
	public _2_Home2 rent() { // ���� Ÿ���� �ݵ�� ���׸� Ÿ�� ���� �ٲ��� ���� ���� ��
	return new _2_Home2();
	}
}
