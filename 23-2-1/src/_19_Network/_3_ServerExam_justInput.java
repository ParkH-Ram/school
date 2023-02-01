package _19_Network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class _3_ServerExam_justInput {
	private static ServerSocket serverSocket = null;
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("������ �����Ϸ��� q �Ǵ� Q �� �Է��ϰ� Enter Ű�� �Է� �ϼ�");
		System.out.println("-------------------------------------------");
		
		//TCP ���� ����   Ʈ�����̼� ��Ʈ�� ��������    transmission control protocol
		startServer();   
		
		//Ű���� �Է�
		while(true) {
			String key = hi.nextLine();
			//�Է��� ���ڸ� �ҹ��ڷ� ��ȯ .toLowerCase()
			if(key.toLowerCase().equals("q")) break;
		}
		hi.close();
		stopServer();
		
		
	}
	public static void startServer() {
		//�۾� ������ ����
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//ServerSocket ���� �� Port ���ε�
					serverSocket = new ServerSocket(50000);   //���� ������ 50000������ ����
					System.out.println("���� ����");
					
					while(true) {
						System.out.println("\n���� ���� ��û ���");
						//���� ����
						//Ŭ���̾�Ʈ�� ���ӽ� ������ ���� ��� �ϳ� ����
						Socket socket = serverSocket.accept();
											
						//Ŭ���̾�Ʈ�� ���� ���� Ȯ��
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println(isa.getHostName() + "���� ��û ����");
						
						//���� �� ������ ����
						socket.close();
						System.out.println(isa.getHostName() + "�� ���� ����");
					}
				}catch(IOException e) {
					System.out.println("����" + e.getMessage());
				}
			}
		};
		//������ ����
		thread.start();
	}
	public static void stopServer() {
		try {
			//ServerSocket�� �ݰ� Port ����ε� ( ���� )
			serverSocket.close();
			System.out.println("���� ����");
		}catch(IOException e1) {}
	}
}
