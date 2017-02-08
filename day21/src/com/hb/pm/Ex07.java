package com.hb.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// 
		File file = new File("./text/Koala.jpg");
		int cnt=0;
		byte[] buff=new byte[3];
		FileInputStream fis = null;
		BufferedInputStream bis= null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		System.out.println("start");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis,50);// 8192byte
			
			fos = new FileOutputStream("./text/Koala2.jpg");
			bos = new BufferedOutputStream(fos,50);
			////////////////////////////
//			while((cnt=fis.read(buff))!=-1){
//				fos.write(buff, 0, cnt);
//			}
			/////////////////////////////
//			while(true){
//				cnt=bis.read();
//				if(cnt==-1){
//					break;
//				}
//				bos.write(cnt);
//				bos.flush();
////				System.out.println((char)cnt);
//			}
			////////////////////////////////
			while(true){
				cnt=bis.read(buff);
				if(cnt==-1){
					break;
				}
				bos.write(buff,0,cnt);
			}
			bos.flush();
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
