package com.hb.pm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		byte[] buff = new byte[50];
		int cnt=0;
		try {
			fis= new FileInputStream("./abc.txt");
			cnt=fis.read(buff);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cnt);
	}

}
