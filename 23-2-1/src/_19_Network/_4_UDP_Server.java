package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class _4_UDP_Server extends Thread {
	private static DatagramSocket datagramSocket = null;
	public static void main(String[]args) {
	
		Scanner hi = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("������ �����Ϸ��� q�� �Է��ϰ� Enter Ű�� �Է��ϼ���");
		System.out.println("-------------------------------------");
		//UDP ���� ����
		startServer();
		
		
		//Ű���� �Է�
		while(true) {
			String key = hi.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		hi.close();
		//UDP ���� ����
		stopServer();
		
	}
	
	public static void startServer() {
		//�۾� ������ ���� 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//DatagramSocket ���� �� port ���ε� ( ���� )
					datagramSocket = new DatagramSocket(50003);
					System.out.println("���� : ����");
					
					//���� ���� �� ������ ���
					while(true) {
						//Ŭ���̾�Ʈ�� �����ϰ� ���� ���� ���� ���
						//Ŭ���̾�Ʈ���� ������ ������ ���� DatagramPacket�� ����
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						//Ŭ���̾�Ʈ�� ���� �����͸� ������ Ȱ��ȭ�� ��. receive : ������ ->  ������ ���� -> Ȱ��ȭ
						datagramSocket.receive(receivePacket);
						// Ŭ���̾�Ʈ�� ���� �����͸� ��Ʈ�� ���·� ��ȯ       
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
						System.out.println(newsKind);
						
						//Ŭ���̾�Ʈ IP�� port ���  //SocketAddress�� ���� Ŭ���̾�Ʈ�� IP�� Ȯ�� 
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						
						//10���� ������ Ŭ���̾�Ʈ�� ����
						for (int i=1; i<=10; i++) {							
							String data = newsKind + ": ����" + i;
							byte [] bytes = data.getBytes("UTF-8");
							//���� �����͸� ����Ʈ �迭�� �Ǿ� �ִ�  ���� ������ �ּҷ� �ؼ� ����Ʈ��� �����͸� ���� ���� ������ �ݴϴ�
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							
							//send�� ���� ���濡�� ����
							datagramSocket.send(sendPacket);
						}
						
					}
					
				}catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		};
		//������ ����
		thread.start();
	}
	public static void stopServer() {
	
			//DatagramSocket�� �ݰ� Port ����ε� ( ���� ���� )
			datagramSocket.close();
			System.out.println("���� : ����");
	
			
	
	}


}
