package _class;

public class quest6_1Ŭ��������{     //Ŭ���� ����
	
	int num;
	boolean isKwang;

	public quest6_1Ŭ��������() {    //�޼ҵ� = ���� ������ ���� �ż� �۵�
		

		this.num = 1;             //this ( Ŭ���� �� ... ���� ����  ������ ��)
		this.isKwang = true;
		}
	
	public quest6_1Ŭ��������(int num, boolean isKWang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info(){            //��Ʈ�� ������ ����� �Ѵ�.
		return num + (isKwang? "K" : "");
	}
	
}

//Ŭ���� ����