package thisJava;

public class TestClass2 {
	
	public static void main(String[]args) {
	

	CompanyInfo companyInfo2 = CompanyInfo.getInstance();
		
	System.out.println(companyInfo2.getCompanyName());
	System.out.println(companyInfo2.getCompanyAddr());

	System.out.println("companyName : " +companyInfo2.getCompanyName() );
	System.out.println("companyName : " +companyInfo2.getCompanyAddr() );
	}
}