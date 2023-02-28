package model;

//model 여기 저기 옮겨다니면서 값 을 넣어주는..?
public class Company {
	String CompanyCode;
	String CompanyName;
	String CompanyList;
	String CompanyBirth;
	String CompanyTotal;
	
	public Company(String CompanyCode, String CompanyName, String CompanyList, String CompanyBirth, String CompanyTotal) {
		this.CompanyCode = CompanyCode;
		this.CompanyName = CompanyName;
		this.CompanyList = CompanyList;
		this.CompanyBirth = CompanyBirth;
		this.CompanyTotal = CompanyTotal;
		
	}
	public Company() {}
	
	
	@Override
	public String toString() {
		return "CompanyTable [CompanyCode=" + CompanyCode + ", CompanyName=" + CompanyName + ", CompanyList="
				+ CompanyList + ", CompanyBirth=" + CompanyBirth + ", CompanyTotal=" + CompanyTotal + "]";
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
	
	
	

}
