package wildcard;

import javax.sound.midi.SysexMessage;

public class GenericExample_오류메시지출력 {
	public static void main(String[]args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		try {
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		try {
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
