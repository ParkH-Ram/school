package _18_DataInput_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class _7_ReadLineExam {
	public static void main(String[]args) throws Exception{
		
		//FileReader에 BufferReader 보조 스트림 연결
		
		//                          보조스트림연결 방법 ( new 메인스트림 ) 
		BufferedReader br = new BufferedReader(new FileReader("C:\\java\\23-1-31\\src\\_18_DataInput_Output\\_6_ReadLineExam.java"));
		//역슬러시는 2개 그냥 슬러시는 1개    -> \\ 2개,  / 1개;
		
		//얘를 위에 처럼 간소화 가능
//		Reader Fr  = new FileReader("C:\\java\\23-1-31\\src\\_18_DataInput_Output\\_6_ReadLineExam.java");
//		BufferedReader br2 = new BufferedReader(Fr);
//		
		
//		//FileOutputStream에 OutputStreamWriter을 이용해서 문자출력
//		OutputStream os = new FileOutputStream("C:/Temp/test.txt");    << 여기서 
//		Writer writer = new OutputStreamWriter(os, "UTF-8");
//		//OutputStreamWriter 보조스트림을 이용해서 문자 출력
		
		
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); // 1행을 읽음
			if(str == null)break;
			System.out.println(lineNo + " \t" + str);
			lineNo++;
		}
		//BufferReader를 닫으면 연결된 FileReader도 닫힘
		br.close();
		
	}
}
