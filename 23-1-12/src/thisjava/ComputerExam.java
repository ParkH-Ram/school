package thisjava;

public class ComputerExam {
	
	public static void main(String[]args) {
		int r =10;
		
		Calculator cal = new Calculator();   //객체를 하나 생성해주고  // 부모 클래스에서 객체 생성
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		
		
	}

}
