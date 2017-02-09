package com.hb.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 
		File file = new File("./text/student2.txt");
		File file2 = new File("./text/student2.txt");
		char[] cbuf = new char[5];
		int cnt=0;
		String tmp="";
		String msg="";
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			fw=new FileWriter(file2,true);
			bw=new BufferedWriter(fw);
//			fw=new FileWriter(file,true);
			while((cnt=br.read(cbuf))!=-1){
				msg+=new String(Arrays.copyOfRange(cbuf, 0, cnt));
				System.out.println(cnt+":"+msg);
			}
			
//			msg+="5/50/55/500\r\n";
//			System.out.println(msg+"\n¸¦ ½è½À´Ï´Ù");
//			for(int i=0; i<10000000;i++){
//				tmp=tmp+i;
//			}
//			fw.write(msg);
			
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
		System.out.println("end");
	}

}
