package com.hb.am;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte[] buf=new byte[5];
		char[] buf=new char[5];
		int cnt=0;
		InputStream inn = System.in;
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		System.out.println("input>");
		try {
			isr=new InputStreamReader(inn);
			osw=new OutputStreamWriter(System.out);
			while((cnt=isr.read(buf))!=-1){
				osw.write(buf, 0, cnt);
			}
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
