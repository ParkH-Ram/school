package _19_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.net.*;
public class _3_EchoClient {
	public static void main(String[]args) {
		try {
			//Socket 생성과 동시에 localHost의 50001 포트로 연결 요청;
			
			//아이피 입력시 앞에 스트링으로 IP 입력하고 , 뒤에 내가 생성한 포트 입력
			Socket socket = new Socket("172.20.10.5",50001);
			System.out.println("클라 연결 성공");
			
			String sendMessage = " :::  동협이가 너 혼난대 ::: ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("클라이언트 데이터 보냄" + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("클라 데이터 받음" + receiveMessage);
			
			//연결 끊기 
			socket.close();
			System.out.println("클라 연결 끊음");
		}catch (Exception e) {}
	}

}
