package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

public class Ex02 {
	public static void main(String[] args) {
		//data - 기본자료형
		//array	- 배열
		Vector obj=null;
		File file = new File("./text/data.txt");
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		
		try{
			if(!file.exists()){
				File file2= new File(file.getParent());
				if(!file2.isDirectory()){
					System.out.println("디렉토리 만들기:"+file2.mkdir());
				}
				System.out.println("파일만들기:"+file.createNewFile());
			}
			
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			ArrayList list=null;
			Vector vec = new Vector();
			vec.add("aaa");
			vec.add(1234);
			vec.add(3.14);
			
			oos.writeObject(vec);
			oos.flush();
			
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			obj=(Vector)ois.readObject();
			
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
				if(ois!=null)ois.close();
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(obj.size());
		for(int i=0; i<obj.size(); i++){
			System.out.println(obj.get(i));
		}
	}
}







