package com.hb.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.print(">");
//		String tmp=sc.nextLine();
		byte[] buff = new byte[10];
		InputStream is = System.in;
		int cnt=0;
		String tmp="";
		try {
			while(true){
					cnt=is.read(buff);	
				if(cnt==-1){
					break;
				}
				String tmp2=null;
				if(buff.length==cnt){
					tmp2=new String(buff);
				}else{
					tmp2=new String(buff,0,cnt);
				}
				System.out.println(tmp2);
				tmp+=tmp2;
				boolean end=false;
				for(int i=0; i<buff.length; i++){
					if(buff[i]==13){
						end=true;
					}
				}
				if(end){
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		String input=tmp;
		
		File file = new File("./text/xyz.txt");
		
		if(file.exists()){
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(file);
				byte[] msg=input.getBytes();
				fos.write(msg, 0, msg.length);				
				System.out.println("xyz.txt파일에 쓰기 완료");
			} catch (FileNotFoundException e) {
				System.out.println("파일없음");
			} catch (IOException e) {
				System.out.println("파일에 쓸수없음");
			} finally {
				try {
						if(fos!=null){
								fos.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			/////
		}else{
			System.out.println("파일이 없어서 못쓰겠네요");
		}
	}

}
