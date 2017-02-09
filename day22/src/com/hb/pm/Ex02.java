package com.hb.pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./text/student2.txt");
		FileReader fr = null;
		BufferedReader br=null;
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
//			while(true){
//				String msg=br.readLine();
//				if(msg==null)break;
//				System.out.println(msg);
//			}
			String msg=null;
			String msg2="";
			while((msg=br.readLine())!=null){
				msg2+=msg+"\r\n";
				System.out.println(msg);
			}
//			msg2=msg2+"5/50/55/100";
			String msgA="6/60/66/100";
			String msgB="7/70/77/100";
			String msgC="8/80/88/100";
			fw=new FileWriter(file,true);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			
			pw.println(msgA);
			pw.println(msgB);
			pw.println(msgC);
			pw.println(1111);
			pw.println(3.14);
			pw.flush();//메모리가 다차지 않아도 쓰기
//			bw.append(msg2+"\r\n");
//			bw.newLine();
//			bw.append(msgA);
//			bw.newLine();
//			bw.append(msgB);
//			bw.newLine();
//			bw.append(msgC);
//			bw.newLine();
//			bw.append(""+123);
//			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)fr.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
