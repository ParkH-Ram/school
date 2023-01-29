package _17_Stream;
//컬렉션으로 부터 스트림 얻기
public class _4_Product {
	private int pno;      		//상품번호
	private String name;			//상품 이름
	private String company;		//상품 회사
	private int price;			//상품 가격 클래스 변수 선언
	
	public _4_Product (int pno, String name, String company, int price) {    //클래스 변수의 값을 받아서 생성자 생성
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getPno() {   // 외부에서  pno 값을 get mothod로 읽으려고
		return pno;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {         //product 데이타가 어떤 값을 같고 있는지 출력 해보려고;
		return new StringBuilder()      //스트링 빌더를 통해서 
			.append("{")
			.append("pno:" + pno + " , ")
			.append("name:" + name + " , ")
			.append("company:" + company + " , ")
			.append("price:" + price + " , ")
			.append("}")
			.toString(); // 스트링 빌더를 스트링으로 바꿔주는   //투스트링이 리턴하는 값이 return new StringBuilder()이 됨
		
		
		 //스트링을 덧 붙인다  배열 처럼  // 같은 집안에 들어가는
	}
	
}
