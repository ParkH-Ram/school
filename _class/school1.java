package _class;

public class school1 {
	
	   public String name;            // �̸�
	   public int ban;
	   public int no;
	   public int kor;
	   public int eng;
	   public int math;
	   
	   public String toString() {  
		      String  hong = "";
		      hong += "�̸� : " + name + "\n";
		      hong += "�� : " + ban + "\n";
		      hong += "��ȣ: " + no +"\n";
		      hong += "�������� : " + kor +  "\n";
		      hong += "�������� : " + eng + "\n";
		      hong += "�������� : " + math +"\n";
		      return hong;
		      
	
				
		}
		public int Total() {
			return kor + eng+math;
			   
		      
		    
	   }
	 
		public int Avg() {   //����� ������ ����.Avg() �̷���..
			return (Total() / 3);
		}

}
