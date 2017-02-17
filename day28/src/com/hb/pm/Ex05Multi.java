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
import java.util.ArrayList;

class Multi extends Thread{
	Socket sock;
	public Multi(Socket sock) {
		this.sock = sock;
	}
	@Override
	public void run() {
		System.out.println(sock.getInetAddress().getHostAddress());
		String msg ="환영합니다";
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
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
//			pw.println("서버토스->"+msg);
//			pw.flush();
			
			ArrayList<Socket> list = Ex05Multi.list;
			for(int i=0; i<list.size(); i++){
				Socket etc = list.get(i);
				os = etc.getOutputStream();
				osw = new OutputStreamWriter(os);
				pw = new PrintWriter(osw);
				pw.println(msg);
				pw.flush();
			}
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버종료");
	}
	}
}

public class Ex05Multi extends Thread{
	static ArrayList<Socket> list = new ArrayList<Socket>();

	public static void main(String[] args) {
		ServerSocket serv=null;
		int cnt=0;
		try {
			serv=new ServerSocket(6000);
			while(true){
				Socket sock = serv.accept();
				cnt++;
				System.out.println(cnt+"개의 접속");
				list.add(sock);
				Multi thr= new Multi(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
