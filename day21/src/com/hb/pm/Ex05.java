package com.hb.pm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cbuf=new char[5];
		int cnt=0;
		FileReader fr=null;
		FileWriter fw=null;
		System.out.println("시작");
		try {
			fr=new FileReader("./text/abc.txt");
			fw=new FileWriter("./text/xyz.txt");
			while(true){
				cnt=fr.read(cbuf);
				if(cnt==-1){
					break;
				}
				fw.write(cbuf,0,cnt);
				fw.flush();
			}
			System.out.println("복사 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}











