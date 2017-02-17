package com.hb.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex03c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socket sock=null; 
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			sock = new Socket("localhost",6000);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg=br.readLine();
			System.out.println(msg);
			
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			while(true){
				System.out.print(">");
				msg=sc.nextLine();
				if("exit".equals(msg))break;
				bw.write(msg);
				bw.write("\n");
				bw.flush();
				msg=br.readLine();
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
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
