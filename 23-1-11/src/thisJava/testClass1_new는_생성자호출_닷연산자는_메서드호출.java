package thisJava;

public class testClass1_new��_������ȣ��_�忬���ڴ�_�޼���ȣ�� {

	public static void main(String[]args) {
		
		CompanyInfo companyInfo1 = CompanyInfo.getInstance();
		// . �����ڴ� ���� �� �ν��Ͻ� �ȿ� �̷� �޼ҵ带 ��ȣ �� ������ �ʵ�  �¸� ������ �ͼ� ���ڴ�.
		
		// new�� �ν��Ͻ��� ����� �ִ°��� 
		// new �ڿ� ���°� ������ ������ 
	
		
		companyInfo1.setCompanyName("�ڵ��Ͽ콺");
		companyInfo1.setCompanyAddr("â�����б� ��� ��¼��");
		
		System.out.println(companyInfo1.getCompanyName());
		System.out.println(companyInfo1.getCompanyAddr());
	}
}
