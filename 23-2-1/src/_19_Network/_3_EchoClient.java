package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.net.*;
public class _3_EchoClient {
	public static void main(String[]args) {
		try {
			//Socket ������ ���ÿ� localHost�� 50001 ��Ʈ�� ���� ��û;
			
			//������ �Է½� �տ� ��Ʈ������ IP �Է��ϰ� , �ڿ� ���� ������ ��Ʈ �Է�
			Socket socket = new Socket("172.20.10.5",50001);
			System.out.println("Ŭ�� ���� ����");
			
			String sendMessage = " :::  �����̰� �� ȥ���� ::: ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("Ŭ���̾�Ʈ ������ ����" + sendMessage);
			
			//������ �ޱ�
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("Ŭ�� ������ ����" + receiveMessage);
			
			//���� ���� 
			socket.close();
			System.out.println("Ŭ�� ���� ����");
		}catch (Exception e) {}
	}

}
