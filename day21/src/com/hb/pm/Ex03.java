package com.hb.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// ���ڿ� ��Ʈ��
		char[] cbuf = new char[5];
		int cnt=0;
		File file = new File("./text/abc.txt");
		
		FileReader fr= null;
		
		try {
			fr = new FileReader(file);
			while(true){
				cnt=fr.read(cbuf);
				System.out.println(cnt+"���� ���ڸ� �о� ���Դϴ�");
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











