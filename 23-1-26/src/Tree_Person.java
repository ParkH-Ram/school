
public class Tree_Person implements Comparable<Tree_Person> { //클래스랑 임플리먼트 컴퍼러블 하고 같은 
	public String name;
	public int age;
	
	public Tree_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Tree_Person o) {
		if(age<o.age) return -1;   // 이 객체는 나이를 기준으로 정렬을 하겠다.
		else if(age == o.age) return 0;
		else return 1;
		
	}
	
	

}
