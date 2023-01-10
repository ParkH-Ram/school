
public class StudentExam {

	public static void main(String[]args) {
		
		Student stud1 = new Student();
		stud1.name = "¼±³²";
		stud1.assigments = 91;
		stud1.exam = 84;
		System.out.println(stud1.toString());
		
		Student stud2 = new Student();
		stud2.name = "¼±³à";
		stud2.assigments = 86;
		stud2.exam = 95;
		System.out.println(stud2.toString());
	}
}
