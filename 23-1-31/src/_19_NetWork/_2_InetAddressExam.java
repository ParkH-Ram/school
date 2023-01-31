package _19_NetWork;

import java.net.InetAddress;

public class _2_InetAddressExam {
	public static void main(String[]args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("���� IP " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("���̹� IP " + remote.getHostAddress());
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
