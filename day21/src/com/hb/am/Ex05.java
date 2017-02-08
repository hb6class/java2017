package com.hb.am;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// 
		File file = new File("./text/xyz.txt");
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			fos=new FileOutputStream(file);
			dos=new DataOutputStream(fos);
			
			dos.writeBoolean(false);//1bit
			dos.write(3);	//1byte
			dos.writeByte(4);	//1byte
			dos.writeInt(100);	//4byte
			dos.writeDouble(3.14);	//8byte
			dos.writeUTF("Hello Java"); //
			System.out.println("¿€º∫≥°");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
			dos.close();
			fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
