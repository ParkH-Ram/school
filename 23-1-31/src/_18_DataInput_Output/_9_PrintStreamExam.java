package _18_DataInput_Output;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class _9_PrintStreamExam {
	public static void main(String[]args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("와따 이거시 뭐시당가?");
		ps.println("프린터가 출력하는 것처럼이라 카지 말고 이거슨 키보드로 입력을 받는 것이 아이당가?");
		ps.println("출력함 해보자고");
		ps.printf("%6d | %-10s | %10s | \n", 1, "뭐시여?", "착한 친구여");
		
		ps.close();
		
	}

}
