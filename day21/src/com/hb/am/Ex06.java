package com.hb.am;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./text/xyz.txt");
		
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			boolean data1 =dis.readBoolean();
			System.out.println(data1);
			int data2=dis.read();
			System.out.println(data2);
			byte data3 = dis.readByte();
			System.out.println(data3);
			int data4 = dis.readInt();
			System.out.println(data4);
			double data5 = dis.readDouble();
			System.out.println(data5);
			String data6 = dis.readUTF();
			System.out.println(data6);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
