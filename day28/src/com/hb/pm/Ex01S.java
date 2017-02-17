package com.hb.pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01S {

	public static void main(String[] args) {
		// server
		System.out.println("서버시작");
		String msg =null;
		ServerSocket srv=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			srv= new ServerSocket(6000);
			Socket sock = srv.accept();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			msg = br.readLine();
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(br!=null)br.close();
					if(isr!=null)isr.close();
					if(is!=null)is.close();
					if(srv!=null)srv.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("서버종료");
		}
		System.out.println("전달받은 메시지는 "+msg);
	}

}
