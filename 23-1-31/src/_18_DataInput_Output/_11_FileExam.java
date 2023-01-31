package _18_DataInput_Output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _11_FileExam {
	public static void main(String[]args)  throws Exception{
		//File 객체 생성
		File dir = new File("C:/Temp/images");     //images 파일 객체 생성
		File file1 = new File("C:/Temp/file1.txt"); //file1.txt 파일 생성
		File file2 = new File("C:/Temp/file2.txt"); //file1.txt 파일 생성
		File file3 = new File("C:/Temp/file3.txt"); //file1.txt 파일 생성
	
		//존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) {dir.mkdirs();}// 존재 하는지 확인 후 존재하지 않으면 dir(images)이라는 이름을 가진  directory를 만들어라 
		if(file1.exists() == false) {file1.createNewFile();}     
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp 폴더의 내용 출력
		File temp  = new File("C:/Temp");        //경로지정
		File[] contents = temp.listFiles();      //temp 안에 있는 리스트들을 contents 배열 안에 담아둠
		
			//날짜에 대한 형식을 받음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");   //년 월 일 am,pm여부  시 : 분
		
		for (File file : contents) { 
			//
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified()))); //심플 데이터를 포맷 형태로 출력  마지막 수정 날짜
			if(file.isDirectory()) {
				
				//쉼표 뒤에 2개가 들어간다  앞에껀 %-10s 다 들어가고 get.name은 -20s에 들어간다
				// - 붙으면 왼쪽 정렬 10칸 출력      %-10s -> 왼족 정렬 왼쪽 부터 10칸 문자 출력
				// 						  %-20s -> 왼쪽 정렬 왼쪽 부터 20글자가 넘으면 초과 출력 넘지 않으면 왼쪽 정렬 후 오른쪽 공간 비움
				System.out.printf("%-10s%20s", "<DIR>", file.getName()); // Directory라면 <DIR>표시와 DIR의 이름을 출력
			}else {
				System.out.printf("%-10s%-20s", file.length(), file.getName()); // file이라면 file의 길이와 file의 이름을 출력
			}
			System.out.println();
		}
		
		
	}

}
