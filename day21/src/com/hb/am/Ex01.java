package com.hb.am;

import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
//		입력(stream)
//		Scanner sc = new Scanner(System.in);
		System.out.println("a:"+(int)'a'+",1="+(int)'1');
		System.out.println("\\r:"+(int)'\r'+",\\n="+(int)'\n');
		InputStream input = System.in;	// 1바이트 
		String msg="";
//		while(true){
//			int a=input.read();
//			if(a==-1){
//				break;
//			}
//			msg+=(char)a;
//		}
		int a=0;
		while((a=input.read())!=-1){
			msg+=(char)a;
		}
		System.out.println(msg);
	}

}



