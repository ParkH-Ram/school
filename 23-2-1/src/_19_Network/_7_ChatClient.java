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
	
	//�޼ҵ� : ���� ����
	public void connect() throws IOException{
		socket = new Socket("localHost", 50001); // ȣ��Ʈ �ۼ�, ��Ʈ ��ȣ �ۼ�
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("Ŭ�󼭹� ���� ����");
	}
	//�޼ҵ� : Json�ޱ�
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
				System.err.println("Ŭ�� : ���� ���� ���� " + e.getMessage());
				System.exit(0);
			}
		});
		thread.start();
	}
	//�޼ҵ� : Json ������
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}
	//�޼ҵ� ���� ����
	public void unconnect()throws IOException{
		socket.close();
	}
	
	public static void main(String[]args) {
		try {
			_7_ChatClient chatClient = new _7_ChatClient();
			chatClient.connect();
			Scanner hi = new Scanner(System.in);
			System.out.println("��ȭ�� �Է� : ");
			chatClient.chatName = hi.nextLine();
			
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("command", "incoming");
			jsonobject.put("data", chatClient.chatName);
			String json = jsonobject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("--------------------------------------");
			System.out.println("���� �޽����� �Է��ϰ� Ȯ��");
			System.out.println("ä�� ���� �Ϸ��� q������ Ȯ��");
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
			System.out.println("Ŭ�� ���� ���� �Ұ�!");
			System.err.println(e.getMessage());
		}
	}
	
	
}
