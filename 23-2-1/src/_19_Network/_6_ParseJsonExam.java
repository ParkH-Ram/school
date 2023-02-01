package _19_Network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class _6_ParseJsonExam {
	public static void main(String[]args) throws IOException{
		//파일로부터 JSON 읽기
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/member.json", Charset.forName("UTF-8")));
		
		try {
			
		String json = br.readLine();
		br.close();
		
		//JSON 파싱
		JSONObject root = new JSONObject(json);
		
		//속성 정보 읽기
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("name"));
 		System.out.println("age: " + root.getInt("age"));                 //Int 로 줬으면 Int로 가져와야 하는데 String으로 가져 오니 에러가 남 잘 확인 바람
		System.out.println("student: " + root.getBoolean("Student"));   
		
		//객체 속성 정보 읽기
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home : " + tel.getString("home"));
		System.out.println("mobile : " + tel.getString("mobile"));
		
		
		//배열 속성 정보 읽기
		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill : ");
		for(int i=0; i<skill.length(); i++) {
			System.out.println(skill.get(i) + ", ");
		}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
