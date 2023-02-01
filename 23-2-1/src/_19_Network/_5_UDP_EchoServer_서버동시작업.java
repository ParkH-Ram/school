package _19_Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _5_UDP_EchoServer_서버동시작업 extends Thread{
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService exeS = Executors.newFixedThreadPool(10);
	
	public static void main(String[]args) {
		System.out.println("-------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요");
		System.out.println("-------------------------------------");
		
		//UDP 서버 시작
		startServer();
		
		//키보드 입력
		Scanner hi = new Scanner(System.in);
		while(true) {
			String key = hi.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		hi.close();
		
			//UDP 서버 종료
			stopServer();
		
	}
	public static void startServer() {
		//작업 스레드 정의 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//DatagramSocket 생성 및 port 바인딩 ( 연결 )
					datagramSocket = new DatagramSocket(50003);
					System.out.println("서버 : 시작");
					
					//연결 수락 및 데이터 통신
					while(true) {
						//클라이언트가 구독하고 싶은 뉴스 주제 얻기
						//클라이언트에서 보내는 데이터 받을 DatagramPacket을 생성
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						//클라이언트로 부터 데이터를 받으면 활성화가 됨. receive : 대기상태 ->  데이터 받음 -> 활성화
						datagramSocket.receive(receivePacket);
						
						exeS.execute(()-> {
							try {
								String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
								
								SocketAddress socketA = receivePacket.getSocketAddress();
								
								
								for (int i=1; i<=10; i++) {							
									String data = newsKind + ": 뉴스" + i;
									byte [] bytes = data.getBytes("UTF-8");
									//보낸 데이터를 바이트 배열로 되어 있는  상대방 아이피 주소로 해서 바이트라는 데이터를 상대방 에게 보내어 줍니다
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketA);
									datagramSocket.send(sendPacket);
								}
							}catch(Exception e) {
								System.err.println(e.getMessage());
							}
						});
					}
				}catch (Exception e) {
					System.out.println("서버 : " + e.getMessage());
				}
			}
		};
		//스레드 시작
		thread.start();
	}
	public static void stopServer() {
	
			//DatagramSocket을 닫고 Port 언바인딩 ( 연결 끊기 )
			datagramSocket.close();
			exeS.shutdownNow(); //스레드풀 종료
			System.out.println("서버 : 종료");
	
			
	
	}
	

}
