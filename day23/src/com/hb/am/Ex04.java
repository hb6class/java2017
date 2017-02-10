package com.hb.am;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cbuf = new char[20];
		int cnt=0;
		File file = new File("./text/data.txt");
		
		FileReader fr =null;
		CharArrayWriter caw =null;
		try {
			fr=new FileReader(file);
			caw=new CharArrayWriter();
			while((cnt=fr.read(cbuf))!=-1){
//				msg+=new String(cbuf);
				caw.write(cbuf, 0, cnt);
			}
			caw.flush();
			System.out.println(new String(caw.toCharArray()));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
