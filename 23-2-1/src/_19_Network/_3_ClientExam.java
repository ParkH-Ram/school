package _19_Network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class _3_ClientExam {
	public static void main(String[]args) {
		try {
			//Socket ������ ���ÿ� localhost 50000 Port�� ���� ��û;
			Socket socket = new Socket("localhost", 50000);
			
			System.out.println("Ŭ���̾�Ʈ ���� �� ");
			
			//Socket �ݱ�
			socket.close();
			System.out.println("���� ������..");
		}catch (UnknownHostException e) {
			//IP ǥ�� �߸��� ���
			System.err.println(e.getMessage());
		}catch(IOException e) {
			//�ش� ��Ʈ ���� ���� �Ұ��� ���
			System.err.println(e.getMessage());
		}
	}

}
