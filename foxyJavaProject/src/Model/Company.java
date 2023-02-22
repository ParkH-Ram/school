package Model;


// 모델 여기저기 옮겨다니는 
public class Company {
	private String CompanyCode;
	private String CompanyName;
	private String CompanyList;
	private String CompanyBirth;
	private String CompanyTotal;
	
	
	public Company() { // 기본 생성자 
		
	}
	
	//company 생성자 선언
	public Company(String CompanyCode, String CompanyName, String CompanyList, String CompanyBirth, String CompanyTotal) {
		this.CompanyCode =  CompanyCode;
		this.CompanyName =  CompanyName;
		this.CompanyList =   CompanyList;
		this.CompanyBirth =  CompanyBirth;
		this.CompanyTotal =   CompanyTotal;
	}
	
	
	public String getCompanyCode() {
		return CompanyCode;
	}
	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyList() {
		return CompanyList;
	}
	public void setCompanyList(String companyList) {
		CompanyList = companyList;
	}
	public String getCompanyBirth() {
		return CompanyBirth;
	}
	public void setCompanyBirth(String companyBirth) {
		CompanyBirth = companyBirth;
	}
	public String getCompanyTotal() {
		return CompanyTotal;
	}
	public void setCompanyTotal(String companyTotal) {
		CompanyTotal = companyTotal;
	}
	@Override
	public String toString() {
		return "Company [CompanyCode=" + CompanyCode + ", CompanyName=" + CompanyName + ", CompanyList=" + CompanyList
				+ ", CompanyBirth=" + CompanyBirth + ", CompanyTotal=" + CompanyTotal + "]";  // 나중에 출력해서 확인하려고 
	}
	
	
}
