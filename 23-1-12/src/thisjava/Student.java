package thisjava;

public class Student {

	protected String name;
	protected int number;
	
	public Student() {
		name ="";
		number =0;
	}
	public Student(String Name, int Number) {
		this.name = Name;
		this.number = Number;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public String toString() {
		return ("이름 : " + name + ", 학번 : " + number);
	}
	public boolean equals(Student other){
		return (this.name.contentEquals(other.name)) && (this.number == other.number);
	}
}
