package _19_Network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class _6_ParseJsonExam {
	public static void main(String[]args) throws IOException{
		//���Ϸκ��� JSON �б�
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/member.json", Charset.forName("UTF-8")));
		
		try {
			
		String json = br.readLine();
		br.close();
		
		//JSON �Ľ�
		JSONObject root = new JSONObject(json);
		
		//�Ӽ� ���� �б�
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("name"));
 		System.out.println("age: " + root.getInt("age"));                 //Int �� ������ Int�� �����;� �ϴµ� String���� ���� ���� ������ �� �� Ȯ�� �ٶ�
		System.out.println("student: " + root.getBoolean("Student"));   
		
		//��ü �Ӽ� ���� �б�
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home : " + tel.getString("home"));
		System.out.println("mobile : " + tel.getString("mobile"));
		
		
		//�迭 �Ӽ� ���� �б�
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
