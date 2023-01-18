package hello230118;

public class Hash_Student {
	private int no;
	private String name;
	
	public Hash_Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {return no;}
	public String getName() {return name;}
	
	//Object�� hashcode() �޼ҵ带 �������ؼ� �л���ȣ�� �̸� �ؽ��ڵ带 ����
	//���ο� �ؽ��ڵ带 ���� �ϵ��� �� (��ȣ�� �̸��� ������ ������ �ؽ��ڵ尡 ������)
	public int hashCode() {            //�������̵�
		int hashCode = no + name.hashCode();
		return hashCode;
	}   ,,,,,,,,,,                                               ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,  ,
	
	//Object�� equals() �޼ҵ带 �������ؼ� Student ��ü���� Ȯ���ϰ�
	//�л� ��ȣ�� �̸��� ������ true�� �����ϵ��� ��
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hash_Student target) {        //���ؼ� ������ Ʈ�� Ʋ���� ���� ����
			if(no == target.getNo()&& name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
