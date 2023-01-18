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
	
	//Object의 hashcode() 메소드를 재정의해서 학생번호와 이름 해시코드를 합한
	//새로운 해시코드를 리턴 하도록 함 (번호와 이름이 같으면 동일한 해시코드가 생성됨)
	public int hashCode() {            //오버라이딩
		int hashCode = no + name.hashCode();
		return hashCode;
	}   ,,,,,,,,,,                                               ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,  ,
	
	//Object의 equals() 메소드를 재정의해서 Student 객체인지 확인하고
	//학생 번호와 이름이 같으면 true를 리턴하도록 함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hash_Student target) {        //비교해서 같으면 트루 틀리면 폴스 리턴
			if(no == target.getNo()&& name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
