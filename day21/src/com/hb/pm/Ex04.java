package com.hb.pm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "문자스트림을 이용한 쓰기";
		File file = new File("./text/abc.txt");
		
		FileWriter fw=null;
		
		try {
			fw = new FileWriter(file);
			fw.write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
