package com.hb.pm;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg ="환영합니다";
		ServerSocket srv=null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			srv=new ServerSocket(6000);
			Socket sock = srv.accept();
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println(msg);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null)pw.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
				if(srv!=null)srv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("서버종료");
		}
		
	}

}
