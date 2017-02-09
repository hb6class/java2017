package com.hb.pm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./text/student2.txt");
		FileReader fr = null;
		BufferedReader br=null;
				
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
//			while(true){
//				String msg=br.readLine();
//				if(msg==null)break;
//				System.out.println(msg);
//			}
			String msg=null;
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
