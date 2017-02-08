package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("./text/abc.txt");
		byte[] buffer = new byte[10];
		
		FileInputStream fis;
		fis = new FileInputStream(file);
		String msg="";
		while(true){
			int input=fis.read(buffer);
			if(input==-1){
				break;
			}
//			System.out.print((char)input);
			msg+=new String(buffer);
		}
		fis.close();
		System.out.println(msg);
//		for(int i=0; i<buffer.length; i++){
//			System.out.print((char)buffer[i]);
//		}
	}

}











