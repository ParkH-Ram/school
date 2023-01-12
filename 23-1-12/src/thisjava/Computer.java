package thisjava;

public class Computer extends Calculator {
	//메소드 오버라이딩
	@Override // 컴파일시 정확히 오버라이딩 되어있는지 체크해줌 (생략 가능 )
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}

}
