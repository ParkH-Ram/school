package _class;

public class school1 {
	
	   public String name;            // 이름
	   public int ban;
	   public int no;
	   public int kor;
	   public int eng;
	   public int math;
	   
	   public String toString() {  
		      String  hong = "";
		      hong += "이름 : " + name + "\n";
		      hong += "반 : " + ban + "\n";
		      hong += "번호: " + no +"\n";
		      hong += "국어점수 : " + kor +  "\n";
		      hong += "영어점수 : " + eng + "\n";
		      hong += "수학점수 : " + math +"\n";
		      return hong;
		      
	
				
		}
		public int Total() {
			return kor + eng+math;
			   
		      
		    
	   }
	 
		public int Avg() {   //실행시 생성한 변수.Avg() 이런식..
			return (Total() / 3);
		}

}
