package _19_Network;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class _6_CreateJson {
	public static void main(String[]args) throws IOException{
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("Student", true);
		
		//객체 생성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);  // 객체 형으로 데이터 입력 ( 객체를 값으로 데이터 입력 )
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		root.put("skill", skill);
		
		//JSON 얻기
		String json = root.toString();
		
		System.out.println(json);
		
		//파일로 저장
		Writer writer = new FileWriter("C:/Temp/member.json");
		writer.write(json);
		writer.close();
		
	}

}
