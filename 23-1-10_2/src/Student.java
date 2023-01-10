
public class Student {
	
	String name= "";
	int assigments  = 0;
	int exam=0;

	//@Override
	public char grade() {
		char grade=0;
		int sum = (int)((this.assigments * 4 + this.exam *6)/100);
		switch(sum) {
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		default : 
		}
	
		return grade;
		
	}
		
		
	public String toString(){	
		
		return "이름 : " + name + "\n과제 점수 : " + assigments + "\n시험 점수 : " + exam + "\n학점 : " + grade() + "\n";
		
	}
	
	
}
