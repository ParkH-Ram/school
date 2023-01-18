package hello230118;


public class Member {
	public String id;
	public String password;
	public String nickname;
	
	public Member(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(this.nickname.contentEquals(target.nickname)) {  //���⼭ ���� �ν��Ͻ� ���� 
												//������ �޶� ��ü���� ������ true ��ȯ
				return true;
			}
		}
		return false;
	}

}
