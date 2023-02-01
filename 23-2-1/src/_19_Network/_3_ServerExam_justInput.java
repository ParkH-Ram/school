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
		System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력 하셈");
		System.out.println("-------------------------------------------");
		
		//TCP 서버 시작   트랜스미션 컨트롤 프로토콜    transmission control protocol
		startServer();   
		
		//키보드 입력
		while(true) {
			String key = hi.nextLine();
			//입력한 문자를 소문자로 변환 .toLowerCase()
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
					//ServerSocket 생성 및 Port 바인딩
					serverSocket = new ServerSocket(50000);   //서버 소켓을 50000번으로 지정
					System.out.println("서버 시작");
					
					while(true) {
						System.out.println("\n서버 연결 요청 대기");
						//연결 수락
						//클라이언트가 접속시 서버와 연결 통로 하나 생성
						Socket socket = serverSocket.accept();
											
						//클라이언트의 접속 정보 확인
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println(isa.getHostName() + "연결 요청 수락");
						
						//연결 후 연결을 끊기
						socket.close();
						System.out.println(isa.getHostName() + "의 연결 끊음");
					}
				}catch(IOException e) {
					System.out.println("서버" + e.getMessage());
				}
			}
		};
		//스레드 시작
		thread.start();
	}
	public static void stopServer() {
		try {
			//ServerSocket을 닫고 Port 언바인딩 ( 해제 )
			serverSocket.close();
			System.out.println("서버 종료");
		}catch(IOException e1) {}
	}
}
