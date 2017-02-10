package com.hb.am;

import java.io.CharArrayReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cbuf = new char[5];
		int cnt=0;
		File file = new File("./text/data.txt");
		String msg="파일을 작성하도록 하겠습니다";
		
		FileWriter fw= null;
		CharArrayReader car=null;
		
		try {
			fw=new FileWriter(file);
			car=new CharArrayReader(msg.toCharArray());
			
			while((cnt=car.read(cbuf))!=-1){
				fw.write(cbuf,0,cnt);				
			}
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
