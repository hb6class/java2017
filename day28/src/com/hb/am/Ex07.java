package com.hb.am;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex07 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://daum.net");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String msg=null;
			
			FileWriter fw= new FileWriter("temp.html");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			while((msg = br.readLine())!=null){
				pw.println(msg);
			}
			pw.flush();
			br.close();
			pw.close();
			bw.close();
			fw.close();
			System.out.println("웹 긁어오기 끝");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
