package com.hb.am;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		//data - 기본자료형
		//array	- 배열
		File file = new File("./text/data.txt");
		
		CharArrayWriter caw=null;
		CharArrayReader car=null;
		try{
			if(!file.exists()){
				File file2= new File(file.getParent());
				if(!file2.isDirectory()){
					System.out.println("디렉토리 만들기:"+file2.mkdir());
				}
				System.out.println("파일만들기:"+file.createNewFile());
			}
			
			String msg="요것을 작성하겠습니다";
			char[] cbuf = msg.toCharArray();
			caw=new CharArrayWriter();
			caw.write(cbuf, 0, cbuf.length);
			caw.flush();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}







