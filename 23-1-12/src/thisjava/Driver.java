package thisjava;

public class Driver {
	
	public static void main(String[]args) {
		
		Undergraduate_대학재학생 under1 = new Undergraduate_대학재학생();
		
		under1.setName("누꼬");
		under1.setNumber(15881588);
		under1.setClubName("사람이 아닙니다");
		
		System.out.println(under1.toString());
		
		Undergraduate_대학재학생 under2 = new Undergraduate_대학재학생 ("뭐꼬", 5999534, "사람입니까?");
		
		System.out.println(under2.toString());  // 글자 리턴 메소드 
		
		if (under1.equals(under2)) {
			System.out.println("같아유");
		}else {
			System.out.println("달라유");
		}
		
	
		
		
	}

}
