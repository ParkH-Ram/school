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
			if(this.nickname.contentEquals(target.nickname)) {  //여기서 만든 인스턴스 변수 
												//번지가 달라도 객체값이 같으면 true 반환
				return true;
			}
		}
		return false;
	}

}
