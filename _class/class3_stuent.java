package _class;

public class class3_stuent {
	
	public static void main(String[]args) {

		
		// 두번째 학생을 나타내는 객체 생성
		Student stud1 = new Student();
		//두번째 학생 이름 설정
		stud1.name = "선남";
		// 두번째 학생의 과제 점수 설정
		stud1.assignmentScore = 91;
		// 두번째 학생의 시험 점수 설정
		stud1.examScore = 84;
		// 두번째 학생 이름, 점수들과 학점 출력
		System.out.println(stud1.toString());
		
		// 두번째 학생을 나타내는 객체 생성
		Student stud2 = new Student();
		//두번째 학생 이름 설정
		stud2.name = "선녀";
		// 두번째 학생의 과제 점수 설정
		stud2.assignmentScore = 86;
		// 두번째 학생의 시험 점수 설정
		stud2.examScore = 95;
		// 두번째 학생 이름, 점수들과 학점 출력
		System.out.println(stud2.toString());
		
		
	}

}
