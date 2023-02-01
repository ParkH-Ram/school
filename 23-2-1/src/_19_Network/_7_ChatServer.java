package _19_Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;


public class _7_ChatServer {
	//�ʵ�
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	public static void main(String[]args) {
		try {
			_7_ChatServer chatServer = new _7_ChatServer();
			chatServer.start();
			
			System.out.println("-------------------------------------");
			System.out.println("������ �����Ϸ��� q�� �Է� �ϰ� enter");
			System.out.println("-------------------------------------");
			
			Scanner hi = new Scanner(System.in);
			while (true) {
				String key = hi.nextLine();
				if(key.equals("q")) break;
			}
			hi.close();
			chatServer.stop();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	//�޼ҵ� : ����

	//�޼��� ����
	public void start()throws IOException{
		serverSocket = new ServerSocket(50001);
		System.out.println("���� : ����");
		
		Thread thread = new Thread(()->  {
			try {
				while(true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);   // �����ݷ� �� Ȯ��...
				}
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}
		});
		thread.start();
	}
	//�޼ҵ� : Ŭ���̾�Ʈ ���� �� SocketClient ���� �� �߰�
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("���� : " + key);
		System.out.println("�� �� �� �� ��  : "  + chatRoom.size() + "\n");
	}
	
	//�޼ҵ� : Ŭ���̾�Ʈ ���� ���� �� SoketClient ����
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("get out here: " + key);
		System.out.println("�� �� ä �� �� �� : " + chatRoom.size() + "\n");
	}
	//�޼ҵ�  : ��� Ŭ���̾�Ʈ���� �޽��� ����
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc : socketClients) {
			if (sc == sender) continue;
			sc.send(json);
		}
	}
	//���� ����
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			chatRoom.values().stream().forEach(sc -> sc.close());
			System.out.println("���� : ����");
		}catch (Exception e1) {
			System.err.println(e1.getMessage());
		}

	}
}
 