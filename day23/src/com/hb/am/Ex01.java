package com.hb.am;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		//data - �⺻�ڷ���
		//array	- �迭
		File file = new File("./text/data.txt");
		
		CharArrayWriter caw=null;
		CharArrayReader car=null;
		try{
			if(!file.exists()){
				File file2= new File(file.getParent());
				if(!file2.isDirectory()){
					System.out.println("���丮 �����:"+file2.mkdir());
				}
				System.out.println("���ϸ����:"+file.createNewFile());
			}
			
			String msg="����� �ۼ��ϰڽ��ϴ�";
			char[] cbuf = msg.toCharArray();
			caw=new CharArrayWriter();
			caw.write(cbuf, 0, cbuf.length);
			caw.flush();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}







