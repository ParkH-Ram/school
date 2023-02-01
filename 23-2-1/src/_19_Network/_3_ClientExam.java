package _19_Network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class _3_ClientExam {
	public static void main(String[]args) {
		try {
			//Socket 생성과 동시에 localhost 50000 Port로 연결 요청;
			Socket socket = new Socket("localhost", 50000);
			
			System.out.println("클라이언트 연결 굳 ");
			
			//Socket 닫기
			socket.close();
			System.out.println("벌써 끊었어..");
		}catch (UnknownHostException e) {
			//IP 표기 잘못된 경우
			System.err.println(e.getMessage());
		}catch(IOException e) {
			//해당 포트 서버 연결 불가한 경우
			System.err.println(e.getMessage());
		}
	}

}
