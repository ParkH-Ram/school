package thisjava;
class Area{
	static void manual() {     // static 정적 고정 클래스  메소드  : 바로 사용가능, void : 반환 값 없음;
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형 넓이");
		System.out.println("rectangle : 사격형 넓이");
		System.out.println("다");
	}
	
	double triangle(int a, int b) {
		return (double)a * b /2 ;    //삼각형 넓이 반환
	}
	int rectangle(int a, int b) {
		return a * b;
	}
}

public class Method2 {

	public static void main(String []args) {
		Area.manual();   // 클래스 정적 스태틱 변수라 클래스명.함수명 으로 바로 호출 가능
		
		//triangle
		double i = 55;
		double j = 44;
		Area trie = new Area();   
		System.out.println(trie.triangle(55,44));    //인스턴스라 생성자 생성 해줘야 함
		System.out.println(trie.rectangle(55,44));
		
	}
}
