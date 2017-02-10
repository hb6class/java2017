package com.hb.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Ex07 {

	public static void main(String[] args) {
		// bytestream <-> 문자스트림
		PrintStream pout = System.out;
		OutputStream out = (OutputStream)pout;
		InputStream inn = System.in;
		
		int cnt=0;
		char[] cbuf=new char[5];
		File file = new File("./text/data.txt");
		FileReader fw=null;
		OutputStreamWriter osw=null;
		try {
			fw=new FileReader(file);
			osw=new OutputStreamWriter(pout);
			while((cnt=fw.read(cbuf))!=-1){
				osw.write(cbuf, 0, cnt);
			}
			osw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}









