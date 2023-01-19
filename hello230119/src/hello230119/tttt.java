package hello230119;

import java.util.*;
import java.text.*;
	
public class tttt{
	
	public static void main(String[]args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.toString();
		System.out.println(strNow2);
	}

}
