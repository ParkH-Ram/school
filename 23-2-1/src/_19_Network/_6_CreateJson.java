package _19_Network;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class _6_CreateJson {
	public static void main(String[]args) throws IOException{
		//JSON ��ü ����
		JSONObject root = new JSONObject();
		
		//�Ӽ� �߰�
		root.put("id", "winter");
		root.put("name", "�Ѱܿ�");
		root.put("age", 25);
		root.put("Student", true);
		
		//��ü ���� �߰�
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);  // ��ü ������ ������ �Է� ( ��ü�� ������ ������ �Է� )
		
		//�迭 �Ӽ� �߰�
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		root.put("skill", skill);
		
		//JSON ���
		String json = root.toString();
		
		System.out.println(json);
		
		//���Ϸ� ����
		Writer writer = new FileWriter("C:/Temp/member.json");
		writer.write(json);
		writer.close();
		
	}

}
