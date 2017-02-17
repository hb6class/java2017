package com.hb.pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg ="환영합니다";
		ServerSocket srv=null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			srv=new ServerSocket(6000);
			Socket sock = srv.accept();
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println(msg);
			pw.flush();
			////////////////////////////////
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while((msg=br.readLine())!=null){
				pw.println("서버토스->"+msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
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
