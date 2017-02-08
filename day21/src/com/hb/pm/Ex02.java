package com.hb.pm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="자바";// 글자 2byte이상 char-2byte
		byte[] by=st.getBytes();
		System.out.println("자바의 by size:"+by.length);
		byte[] msg={97,98,99,100,101};// 0 ~ 127
		System.out.println("byte의 max:"+Byte.MAX_VALUE);
		System.out.println("byte의 min:"+Byte.MIN_VALUE);
		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream("./text/abc.txt");
			fos.write(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
