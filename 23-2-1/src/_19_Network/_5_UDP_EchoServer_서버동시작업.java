package _19_Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _5_UDP_EchoServer_���������۾� extends Thread{
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService exeS = Executors.newFixedThreadPool(10);
	
	public static void main(String[]args) {
		System.out.println("-------------------------------------");
		System.out.println("������ �����Ϸ��� q�� �Է��ϰ� Enter Ű�� �Է��ϼ���");
		System.out.println("-------------------------------------");
		
		//UDP ���� ����
		startServer();
		
		//Ű���� �Է�
		Scanner hi = new Scanner(System.in);
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
						
						exeS.execute(()-> {
							try {
								String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
								
								SocketAddress socketA = receivePacket.getSocketAddress();
								
								
								for (int i=1; i<=10; i++) {							
									String data = newsKind + ": ����" + i;
									byte [] bytes = data.getBytes("UTF-8");
									//���� �����͸� ����Ʈ �迭�� �Ǿ� �ִ�  ���� ������ �ּҷ� �ؼ� ����Ʈ��� �����͸� ���� ���� ������ �ݴϴ�
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketA);
									datagramSocket.send(sendPacket);
								}
							}catch(Exception e) {
								System.err.println(e.getMessage());
							}
						});
					}
				}catch (Exception e) {
					System.out.println("���� : " + e.getMessage());
				}
			}
		};
		//������ ����
		thread.start();
	}
	public static void stopServer() {
	
			//DatagramSocket�� �ݰ� Port ����ε� ( ���� ���� )
			datagramSocket.close();
			exeS.shutdownNow(); //������Ǯ ����
			System.out.println("���� : ����");
	
			
	
	}
	

}
