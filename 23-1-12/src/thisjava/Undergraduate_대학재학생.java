package thisjava;

public class Undergraduate_�������л� extends Student{
	//���л��� �Ҽ� ���Ƹ����� �����ϴ� ��ü ����
	private String clubName;
	
	//�кλ��� ���� ���� �⺻ ������ �ʱ�ȭ�ϸ鼭 ��ü�� ����
	public Undergraduate_�������л�() {
		super();        //�θ�Ŭ������ ������ �޼ҵ带 ȣ��
		clubName = "";
	}
	
	// �кλ��� ������ ���� �Ű����� ������ �ʱ�ȭ�ϸ鼭 ��ü�� �����Ѵ�.
	public Undergraduate_�������л�(String Name, int Number, String ClubName) {
		super(Name, Number);
		setClubName(ClubName);
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String ClubName) {
		this.clubName = ClubName;
	}
	public String toString() {
		return super.toString() + ", ���Ƹ� �̸�: " + getClubName();
	}
	
	public boolean equals(Undergraduate_�������л� other) {
		return (super.equals(other)) && (this.clubName.equals(other.clubName));
	}
	

}
