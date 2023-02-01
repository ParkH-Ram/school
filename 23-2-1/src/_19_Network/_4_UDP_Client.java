package _19_Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class _4_UDP_Client {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		try {
			//DatagramSocket ����
			DatagramSocket dataG = new DatagramSocket();
			
			//�����ϰ� ���� ���� ���� ������
			String data = ("����;  ���� ���� ����!"); 
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(
					bytes, bytes.length, new InetSocketAddress("localHost", 50003)
					);
			dataG.send(sendPacket);
			
			while(true) {
				//���� �ޱ�
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
				dataG.receive(receivePacket);
				
				//���ڷ� ��ȯ
				String news = new String(receivePacket.getData(),0,receivePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				//10��° ������ ������ while �� ����
				if(news.contains("����10")) break;
			}
			dataG.close();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
