package thisjava;

public class Generic_Product<K, M> {         // 타입 파라미터로 K와 M을 정의
	
	//클래스 변수
	private K kind;
	private M model;
	
	//메서드
	public K getKind() {return this.kind;}
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}

}
