package com.hb.pm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex01C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "자바 소켓통신";
		System.out.println("접속 시작");
		String ip ="203.236.209.193";
		int port=6000;
		
		Socket sock=null;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			sock = new Socket(ip,port);
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.newLine();
			bw.flush();
			System.out.println("전달 완료");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
