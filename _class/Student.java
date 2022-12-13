package _class;

public class Student {
	   // 객체 변수들
	   public String name;            // 이름
	   public int assignmentScore;    // 과제 점수
	   public int examScore;         // 시험 점수
	   
	   // 객체 메소드들
	   // 현 Student 객체의 정보에 대한 문자열을 반환한다.
	   public String toString() {  
	      String str = "";
	      str += "이름: " + name + "\n";
	      str += "과제 점수: " + assignmentScore + "\n";
	      str += "시험 점수: " + examScore + "\n";
	      str += "학점: " + getGrade() + "\n";
	      return str;
	   }
	   
	   // 학생의 학점을 반환한다.
	   public char getGrade() {
	      char letterGrade;      // 학생의 학점
	      double total;         // 학생 점수의 총점
	      
	      // 학생의 점수들의 총점을 계산
	      total = assignmentScore * 0.4 + examScore * 0.6;
	      
	      // 총점에 따른 학점을 부여
	      if (total >= 90) letterGrade = 'A';
	      else if (total >= 80) letterGrade = 'B';
	      else if (total >= 70) letterGrade = 'C';
	      else if (total >= 60) letterGrade = 'D';
	      else letterGrade = 'F';
	      
	      return letterGrade;
	   }
}
