import java.util.*;
import java.text.*;
	
public class Data_Exam {
	public static void main(String[]args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);   // 년.월.일 시.분.초 로 바꿔줌
		System.out.println(strNow2);
	}

}
