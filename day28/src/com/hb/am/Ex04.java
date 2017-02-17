package com.hb.am;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex04 {

	public static void main(String[] args) {
		// ÀüÈ­
		try {
			InetAddress addr1 = InetAddress.getByName("www.naver.com");
			InetAddress addr2 = InetAddress.getByName("169.254.153.102");
			InetAddress addr3 = InetAddress.getLocalHost();
			InetAddress addr4 = InetAddress.getByName("127.0.0.1");
			System.out.println(addr1.getHostAddress());
			System.out.println(addr2.getHostName());
			System.out.println(addr3.getHostAddress());
			System.out.println(addr3.getHostName());
			System.out.println(addr4.getHostName());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
