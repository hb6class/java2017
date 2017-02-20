package com.hb.am;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("UDP SERVER start");
		byte[] buf = new byte[5];
		DatagramSocket ds=null;
		
		try {
			ds=new DatagramSocket(6000);
			while(true){
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String msg =new String(dp.getData());
			System.out.println("받은 메시지>"+msg);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
