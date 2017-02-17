package com.hb.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socket sock = null;
		OutputStream os=null;
		InputStream is=null;
		byte[] buf= new byte[512];
		int cnt=0;
		try {
			sock=new Socket("localhost",6000);
			os = sock.getOutputStream();
			is = sock.getInputStream();
			
			do{
				System.out.print(">");
				String msg = sc.nextLine();
				byte[] temp = msg.getBytes();
				os.write(temp);
				cnt=is.read(buf);
				byte[] m = Arrays.copyOfRange(buf, 0, cnt);
				System.out.println("re:"+new String(m));
			}while(cnt!=-1);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				os.close();
				is.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
