package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	_7_ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	
	public SocketClient(_7_ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	//�޼ҵ� : JSON �ޱ�
	public void receive() {
		chatServer.threadPool.execute(()-> {
			try {
				while(true) {
					String receiveJson = dis.readUTF();
					
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command) {
						case "incoming":
							this.chatName = jsonObject.getString("data");
							chatServer.sendToAll(this, "���Խ�");
							chatServer.addSocketClient(this);
							break;
					}
				}
			}catch(Exception e) {
				chatServer.sendToAll(this, "�ͳ�����?");
				chatServer.removeSocketClient(this);
			}
		});
		
	}
	//�޼ҵ� : JSON ������
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	public void close() {
		try {
			socket.close();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
