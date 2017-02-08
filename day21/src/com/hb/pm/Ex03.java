package com.hb.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열 스트림
		char[] cbuf = new char[5];
		int cnt=0;
		File file = new File("./text/abc.txt");
		
		FileReader fr= null;
		
		try {
			fr = new FileReader(file);
			while(true){
				cnt=fr.read(cbuf);
				System.out.println(cnt+"개의 문자를 읽어 들입니다");
				System.out.println(new String(cbuf));
				if(cnt==-1){
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}











