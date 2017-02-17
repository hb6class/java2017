package com.hb.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket srv= null;
		OutputStream os=null;
		InputStream is=null;
		byte[] buf= new byte[512];
		try {
			srv=new ServerSocket(6000);
			Socket sock = srv.accept();
			os = sock.getOutputStream();
			is = sock.getInputStream();
			int cnt=0;
			while((cnt=is.read(buf))!=-1){
				os.write(buf,0,cnt);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				srv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
