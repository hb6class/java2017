package com.hb.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inn = System.in;
		InputStreamReader isr = new InputStreamReader(inn);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("�ּ��Է�>");
		try {
			String st = br.readLine();
			
//			InetAddress addr = InetAddress.getByName(st);
//			System.out.println("ip:"+addr.getHostAddress());
			InetAddress[] allAddr = InetAddress.getAllByName(st);
			System.out.println(allAddr.length+"���� �ּҸ� ���� ����");
			for(int i=0; i<allAddr.length; i++){
				System.out.println("ip:"+allAddr[i].getHostAddress());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
