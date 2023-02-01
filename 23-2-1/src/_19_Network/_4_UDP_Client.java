package _19_Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class _4_UDP_Client {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		try {
			//DatagramSocket 생성
			DatagramSocket dataG = new DatagramSocket();
			
			//구독하고 싶은 뉴스 주제 보내기
			String data = ("연애;  연예 말고 연애!"); 
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(
					bytes, bytes.length, new InetSocketAddress("localHost", 50003)
					);
			dataG.send(sendPacket);
			
			while(true) {
				//뉴스 받기
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
				dataG.receive(receivePacket);
				
				//문자로 변환
				String news = new String(receivePacket.getData(),0,receivePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				//10번째 뉴스를 받으면 while 문 종료
				if(news.contains("뉴스10")) break;
			}
			dataG.close();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
