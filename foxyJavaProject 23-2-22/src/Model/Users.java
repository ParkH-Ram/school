package Model;

public class Users {
	String UserId;			// 유저 아이디
	String UserPassword;		// 유저 비밀번호
	String UserName;			// 유저 이름
	String UserPhoneNum;	// 휴대폰 번호
	
	
	
	public Users() {}
	public Users(String UserId, String UserPassword, String UserName, String UserPhoneNum) {
		this.UserId = UserId;
		this.UserPassword = UserPassword;
		this.UserName = UserName;
		this.UserPhoneNum = UserPhoneNum;
	}
	
	public String getUserId() {
		return UserId;
	}
	
	public void setUserId(String userId) {
		UserId = userId;
	}
	
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPhoneNum() {
		return UserPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		UserPhoneNum = userPhoneNum;
	}
	
	@Override
	public String toString() {
		return "Users [UserId=" + UserId + ", UserPassword=" + UserPassword + ", UserName=" + UserName + ", UserPhoneNum="
				+ UserPhoneNum + "]";
	}
	
	
}
