package _17_Stream;
//컬렉션으로 부터 스트림 얻기
public class _4_Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	public _4_Product (int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getPno() {
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
	public String toString() {
		return new StringBuilder() 
			.append("{")
			.append("pno:" + pno + " , ")
			.append("name:" + name + " , ")
			.append("company:" + company + " , ")
			.append("price:" + price + " , ")
			.append("}")
			.toString(); // 스트링 빌더를 스트링으로 바꿔주는
		
		
		 //스트링을 덧 붙인다  배열 처럼  // 같은 집안에 들어가는
	}
	
}
