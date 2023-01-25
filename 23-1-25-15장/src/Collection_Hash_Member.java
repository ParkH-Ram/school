
public class Collection_Hash_Member {
	public String name;
	public int age;
	
	public Collection_Hash_Member(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	//hashCode ������
	@Override
	public int hashCode() {
		//name�� age ���� ������ ������ �ؽ��ڵ� ����
		return name.hashCode() + age;
	}
	
	//equals ������
	public boolean equals(Object obj) {
		if(obj instanceof Collection_Hash_Member) {
			Collection_Hash_Member target = (Collection_Hash_Member)obj;
			return target.name.equals(name)&&(target.age == age);
		}else {
			return false;
		}
	}

}
