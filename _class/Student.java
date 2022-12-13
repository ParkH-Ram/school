package _class;

public class Student {
	   // ��ü ������
	   public String name;            // �̸�
	   public int assignmentScore;    // ���� ����
	   public int examScore;         // ���� ����
	   
	   // ��ü �޼ҵ��
	   // �� Student ��ü�� ������ ���� ���ڿ��� ��ȯ�Ѵ�.
	   public String toString() {  
	      String str = "";
	      str += "�̸�: " + name + "\n";
	      str += "���� ����: " + assignmentScore + "\n";
	      str += "���� ����: " + examScore + "\n";
	      str += "����: " + getGrade() + "\n";
	      return str;
	   }
	   
	   // �л��� ������ ��ȯ�Ѵ�.
	   public char getGrade() {
	      char letterGrade;      // �л��� ����
	      double total;         // �л� ������ ����
	      
	      // �л��� �������� ������ ���
	      total = assignmentScore * 0.4 + examScore * 0.6;
	      
	      // ������ ���� ������ �ο�
	      if (total >= 90) letterGrade = 'A';
	      else if (total >= 80) letterGrade = 'B';
	      else if (total >= 70) letterGrade = 'C';
	      else if (total >= 60) letterGrade = 'D';
	      else letterGrade = 'F';
	      
	      return letterGrade;
	   }
}
