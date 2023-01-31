package _18_DataInput_Output;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _11_FilesExam {
	public static void main(String[]args) {
		try {
			String data = "" + "id: winter\n"+
					"email : winter@mycompany.com\n" +
					"tel : 010 - 123 - 1234" +
					"한글";
			
			//Path 객체 생성
			Path path  = Paths.get("C:/Temp/user.txt");
			
			//파일 생성 및 데이터 저장
			//버전 낮아서 안 됨
			Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
			
			//파일 정보 얻기
			System.out.println("파일 유형: " + Files.probeContentType(path));
			System.out.println("파일 크기: " + Files.size(path) + "bytes");
			
			//버전 낮아서 안 됨ㄴ
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
					
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
