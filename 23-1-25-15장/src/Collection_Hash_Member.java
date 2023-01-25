
public class Collection_Hash_Member {
	public String name;
	public int age;
	
	public Collection_Hash_Member(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		//name과 age 값이 같으면 동일한 해시코드 리턴
		return name.hashCode() + age;
	}
	
	//equals 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Collection_Hash_Member) {
			Collection_Hash_Member target = (Collection_Hash_Member)obj;
			return target.name.equals(name)&&(target.age == age);
		}else {
			return false;
		}
	}

}
