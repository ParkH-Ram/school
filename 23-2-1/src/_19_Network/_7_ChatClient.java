package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class _7_ChatClient {
	
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	//메소드 : 서버 연결
	public void connect() throws IOException{
		socket = new Socket("localHost", 50001); // 호스트 작성, 포트 번호 작성
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("클라서버 연결 ㅇㅋ");
	}
	//메소드 : Json받기
	public void receive() {
		Thread thread = new Thread(() ->{
			try {
				while(true) {
					String json = dis.readUTF();
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp + "> " + message);
				}
			}catch (Exception e) {
				System.err.println("클라 : 서버 연결 끊김 " + e.getMessage());
				System.exit(0);
			}
		});
		thread.start();
	}
	//메소드 : Json 보내기
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}
	//메소드 연결 종료
	public void unconnect()throws IOException{
		socket.close();
	}
	
	public static void main(String[]args) {
		try {
			_7_ChatClient chatClient = new _7_ChatClient();
			chatClient.connect();
			Scanner hi = new Scanner(System.in);
			System.out.println("대화명 입력 : ");
			chatClient.chatName = hi.nextLine();
			
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("command", "incoming");
			jsonobject.put("data", chatClient.chatName);
			String json = jsonobject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("--------------------------------------");
			System.out.println("보낼 메시지를 입력하고 확인");
			System.out.println("채팅 종료 하려면 q누르고 확인");
			System.out.println("--------------------------------------");
			while(true) {
				String message = hi.nextLine();
				if(message.toLowerCase().equals("q")) break;
				else {
					jsonobject = new JSONObject();
					jsonobject.put("command", "message");
					jsonobject.put("data", message);
					json = jsonobject.toString();
					chatClient.send(json);
				}
			}
			hi.close();
			chatClient.unconnect();
		}catch(Exception e) {
			System.out.println("클라 서버 연결 불가!");
			System.err.println(e.getMessage());
		}
	}
	
	
}
