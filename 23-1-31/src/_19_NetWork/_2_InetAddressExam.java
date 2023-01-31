package _19_NetWork;

import java.net.InetAddress;

public class _2_InetAddressExam {
	public static void main(String[]args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴 IP " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("네이버 IP " + remote.getHostAddress());
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
