package _13Generic;

public class _2_Product <K, M>{      //타입 파라미터로 K와 M정의
	//필드 = 인스턴스 변수
	private K kind;   // K,M에 타입 대입
	private M model;
	
	//메소드
	public K getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

	
	
	
	
	

}
