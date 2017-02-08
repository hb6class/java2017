package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args){
		byte[] buff = new byte[10];
		
		File file1 = new File("./text/abc.txt");
		File file2 = new File("./text/xyz.txt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream(file1);
			fos=new FileOutputStream(file2);
			int cnt=0;
			while(true){
				cnt=fis.read(buff);
				System.out.println("read를 통해 일어들인 량"+cnt);
				if(cnt==-1){
					break;
				}
				fos.write(buff,0,cnt);
			}
		}catch(IOException e){
			System.out.println("파일복사 실패");
		}finally{
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
