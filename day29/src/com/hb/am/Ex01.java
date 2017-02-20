package com.hb.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex01 {

	public static void main(String[] args) {
		// udp client
//		InputStream inn = System.in;
//		InputStreamReader isr = new InputStreamReader(inn);
//		BufferedReader br = new BufferedReader(isr);
		String msg="123456";
		DatagramSocket ds = null;
		try {
			System.out.print(">");
//			msg=br.readLine();
			
			ds = new DatagramSocket();
			InetAddress addr = InetAddress.getByName("203.236.209.193");
			int port =6000;
			byte[] buff = msg.getBytes();
			
			DatagramPacket dp = new DatagramPacket(buff,buff.length,addr,port);
			ds.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
