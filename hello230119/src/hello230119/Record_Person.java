package hello230119;

public class Record_Person {
	private final String name;
	private final int age;
	
	public Record_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String name() {return this.name;}
	public int age() {return this.age;}
	
	@Override
	public int hashCode() {
	
	}
}

