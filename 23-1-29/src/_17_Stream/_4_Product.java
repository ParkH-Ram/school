package _17_Stream;
//�÷������� ���� ��Ʈ�� ���
public class _4_Product {
	private int pno;      		//��ǰ��ȣ
	private String name;			//��ǰ �̸�
	private String company;		//��ǰ ȸ��
	private int price;			//��ǰ ���� Ŭ���� ���� ����
	
	public _4_Product (int pno, String name, String company, int price) {    //Ŭ���� ������ ���� �޾Ƽ� ������ ����
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public int getPno() {   // �ܺο���  pno ���� get mothod�� ��������
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
	public String toString() {         //product ����Ÿ�� � ���� ���� �ִ��� ��� �غ�����;
		return new StringBuilder()      //��Ʈ�� ������ ���ؼ� 
			.append("{")
			.append("pno:" + pno + " , ")
			.append("name:" + name + " , ")
			.append("company:" + company + " , ")
			.append("price:" + price + " , ")
			.append("}")
			.toString(); // ��Ʈ�� ������ ��Ʈ������ �ٲ��ִ�   //����Ʈ���� �����ϴ� ���� return new StringBuilder()�� ��
		
		
		 //��Ʈ���� �� ���δ�  �迭 ó��  // ���� ���ȿ� ����
	}
	
}
