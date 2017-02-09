package com.hb.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
		// data - 기본 자료타입
		// 
		File file = new File("./text/student.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			oos.writeBoolean(false);
			oos.writeInt(1234);
			oos.writeDouble(3.14);
			oos.writeUTF("문자열");
			///////////////////////////////
			Vector vec1 = new Vector();
			Vector vec2 = new Vector();
				vec2.addElement("data1");
				vec2.addElement("data2");
				vec2.addElement("data3");
			vec1.addElement("java");
			vec1.addElement(4321);
			vec1.addElement(5.14);
			vec1.addElement(vec2);
			oos.writeObject(vec1);
			///////////////////////////////
			oos.flush();
			
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			System.out.println(ois.readBoolean());
			System.out.println(ois.readInt());
			System.out.println(ois.readDouble());
			System.out.println(ois.readUTF());
			//////////////////////////////////
			Vector vec11=(Vector)ois.readObject();
//			Enumeration ele = vec11.elements();
//			while(ele.hasMoreElements()){
//				System.out.println(ele.nextElement());
//			}
			System.out.println(vec11.get(0));
			System.out.println(vec11.get(1));
			System.out.println(vec11.get(2));
			Vector vec111=(Vector)vec11.get(3);
			System.out.println(vec111.get(0));
			System.out.println(vec111.get(1));
			System.out.println(vec111.get(2));
			//////////////////////////////////
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)ois.close();
				if(oos!=null)oos.close();
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}












