package thisJava;

public class testClass1_new는_생성자호출_닷연산자는_메서드호출 {

	public static void main(String[]args) {
		
		CompanyInfo companyInfo1 = CompanyInfo.getInstance();
		// . 연산자는 쟤는 이 인스턴스 안에 이런 메소드를 괄호 안 붙으면 필드  걔를 가지고 와서 쓰겠다.
		
		// new는 인스턴스를 만들어 주는거죠 
		// new 뒤에 오는건 무조건 생성자 
	
		
		companyInfo1.setCompanyName("코드하우스");
		companyInfo1.setCompanyAddr("창원대학교 산업 어쩌고");
		
		System.out.println(companyInfo1.getCompanyName());
		System.out.println(companyInfo1.getCompanyAddr());
	}
}
