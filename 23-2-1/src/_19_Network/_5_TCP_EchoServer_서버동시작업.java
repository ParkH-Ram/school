package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _5_TCP_EchoServer_서버동시작업 {
	private static ServerSocket serverSocket = null;
	//동시 작업 제한
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	
	
	public static void main(String[]args) {
		System.out.println("-------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요");
		System.out.println("-------------------------------------");
		
		//TCP 서버 시작
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
		//작업 스레드 정의 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//ServerSocket 생성 및 port 바인딩 ( 연결 )
					serverSocket = new ServerSocket(50000);
					System.out.println("서버 시작");
					
					//연결 수락 및 데이터 통신
						while(true) {
								//	System.out.println("\n서버 연결 요청 대기");
							//연결 수락
							Socket socket = serverSocket.accept();
							executorService.execute(() -> {
							try {
								//연결된 클라이언트 정보 얻기
								InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
								System.out.println("서버 : " + isa.getHostName() + "의 연결 요청 수락");
								
								//데이터 받기
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();
								
								//데이터 보내기
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("서버 ] 받은 데이터를 다시 보냄" + message);
								
								//연결 끊기
								socket.close();
								System.out.println(isa.getHostName() + "의 연결 끊음");

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
		//스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		try {
			//ServerSocket을 닫고 Port 언바인딩 ( 연결 끊기 )
			serverSocket.close();
			System.out.println("서버 종료");
			} catch (Exception e1) {
				System.err.println(e1.getMessage());
			  }
	}
				
	
}

			
		

