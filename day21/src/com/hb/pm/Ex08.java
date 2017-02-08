package com.hb.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		char[] buff = new char[50];
		File file = new File("./text/abc.bin");
		
		FileReader fr= null;
		BufferedReader br= null;
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		System.out.println("start");
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			fw=new FileWriter("xyz.txt");
			bw=new BufferedWriter(fw);
			
			while(true){
				cnt=br.read(buff);
				if(cnt==-1)break;
				bw.write(buff,0,cnt);
			}
			bw.flush();
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}














