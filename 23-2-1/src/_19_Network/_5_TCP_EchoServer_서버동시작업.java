package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _5_TCP_EchoServer_���������۾� {
	private static ServerSocket serverSocket = null;
	//���� �۾� ����
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	
	
	public static void main(String[]args) {
		System.out.println("-------------------------------------");
		System.out.println("������ �����Ϸ��� q�� �Է��ϰ� Enter Ű�� �Է��ϼ���");
		System.out.println("-------------------------------------");
		
		//TCP ���� ����
		startServer();
		
		Scanner hi = new Scanner(System.in);
		while(true) {
			String key = hi.nextLine();
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
					//ServerSocket ���� �� port ���ε� ( ���� )
					serverSocket = new ServerSocket(50000);
					System.out.println("���� ����");
					
					//���� ���� �� ������ ���
						while(true) {
								//	System.out.println("\n���� ���� ��û ���");
							//���� ����
							Socket socket = serverSocket.accept();
							executorService.execute(() -> {
							try {
								//����� Ŭ���̾�Ʈ ���� ���
								InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
								System.out.println("���� : " + isa.getHostName() + "�� ���� ��û ����");
								
								//������ �ޱ�
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();
								
								//������ ������
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("���� ] ���� �����͸� �ٽ� ����" + message);
								
								//���� ����
								socket.close();
								System.out.println(isa.getHostName() + "�� ���� ����");

								}catch (Exception e) {
									System.err.println(e.getMessage());
								}
							});
						}
				}catch (Exception e1) {
					System.err.println(e1.getMessage());
				}
			}
		};
		//������ ����
		thread.start();
	}
	
	public static void stopServer() {
		try {
			//ServerSocket�� �ݰ� Port ����ε� ( ���� ���� )
			serverSocket.close();
			System.out.println("���� ����");
			} catch (Exception e1) {
				System.err.println(e1.getMessage());
			  }
	}
				
	
}

			
		

