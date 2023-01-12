package thisjava;

public class Undergraduate_대학재학생 extends Student{
	//대학생의 소속 동아리명을 지정하는 객체 변수
	private String clubName;
	
	//학부생의 변수 값을 기본 값으로 초기화하면서 객체를 생성
	public Undergraduate_대학재학생() {
		super();        //부모클래스의 생성자 메소드를 호출
		clubName = "";
	}
	
	// 학부생의 변수들 값을 매개변수 값으로 초기화하면서 객체를 생성한다.
	public Undergraduate_대학재학생(String Name, int Number, String ClubName) {
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
		return super.toString() + ", 동아리 이름: " + getClubName();
	}
	
	public boolean equals(Undergraduate_대학재학생 other) {
		return (super.equals(other)) && (this.clubName.equals(other.clubName));
	}
	

}
