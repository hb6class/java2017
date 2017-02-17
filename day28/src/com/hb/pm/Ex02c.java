package com.hb.pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ex02c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket sock=null; 
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			sock = new Socket("localhost",6000);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg=br.readLine();
			
			System.out.println(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
